package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class PluginGoogleGame implements org.cocos2dx.plugin.InterfaceGoogleGame {
    private static final int RC_ACHIEVEMENT_UI = 9001;
    static android.content.Context mContext;
    private java.lang.String TAG = "GoogleGame";
    private java.lang.Object achievementsClient;

    public PluginGoogleGame(android.content.Context context) {
        mContext = context;
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginGoogleGame.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.google.android.gms.games.PlayGamesSdk.initialize(org.cocos2dx.plugin.PluginGoogleGame.mContext.getApplicationContext());
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void getPlayer() {
        com.google.android.gms.games.PlayGames.getPlayersClient((android.app.Activity) mContext).getCurrentPlayer().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.gms.games.Player>() { // from class: org.cocos2dx.plugin.PluginGoogleGame.2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(com.google.android.gms.tasks.Task<com.google.android.gms.games.Player> task) {
                try {
                    com.google.android.gms.games.Player result = task.getResult();
                    if (result != null) {
                        java.lang.String playerId = result.getPlayerId();
                        android.util.Log.d(org.cocos2dx.plugin.PluginGoogleGame.this.TAG, "pid " + playerId);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("playerId", playerId);
                        jSONObject.put("iconImageUrl", result.getIconImageUrl());
                        jSONObject.put("title", result.getTitle());
                        jSONObject.put("displayName", result.getDisplayName());
                        jSONObject.put("hiResImageUrl", result.getHiResImageUrl());
                        org.cocos2dx.plugin.PluginGoogleGame.this.callLua(1, jSONObject.toString());
                    } else {
                        org.cocos2dx.plugin.PluginGoogleGame.this.callLua(0, "get player failed");
                    }
                } catch (java.lang.Exception unused) {
                    org.cocos2dx.plugin.PluginGoogleGame.this.callLua(0, "get player failed");
                }
            }
        });
    }

    public void callLua(final int i, final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginGoogleGame.3
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxLuaJavaBridge.callLuaGlobalFunctionWithString("sdkCallGoogleGame", i + "," + str);
            }
        });
    }

    public void signIn(final com.google.android.gms.games.GamesSignInClient gamesSignInClient) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginGoogleGame.4
            @Override // java.lang.Runnable
            public void run() {
                gamesSignInClient.signIn().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.gms.games.AuthenticationResult>() { // from class: org.cocos2dx.plugin.PluginGoogleGame.4.1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public void onComplete(com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> task) {
                        if (!task.isSuccessful() || !task.getResult().isAuthenticated()) {
                            android.util.Log.d(org.cocos2dx.plugin.PluginGoogleGame.this.TAG, "signin failed");
                            org.cocos2dx.plugin.PluginGoogleGame.this.callLua(0, "signin failed");
                        } else {
                            android.util.Log.d(org.cocos2dx.plugin.PluginGoogleGame.this.TAG, "signin and Auth");
                            org.cocos2dx.plugin.PluginGoogleGame.this.getPlayer();
                        }
                    }
                });
            }
        });
    }

    public void login() {
        try {
            final com.google.android.gms.games.GamesSignInClient gamesSignInClient = com.google.android.gms.games.PlayGames.getGamesSignInClient((android.app.Activity) mContext);
            gamesSignInClient.isAuthenticated().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.gms.games.AuthenticationResult>() { // from class: org.cocos2dx.plugin.PluginGoogleGame.5
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> task) {
                    try {
                        if (!task.isSuccessful() || !task.getResult().isAuthenticated()) {
                            android.util.Log.d(org.cocos2dx.plugin.PluginGoogleGame.this.TAG, "need signin");
                            org.cocos2dx.plugin.PluginGoogleGame.this.signIn(gamesSignInClient);
                        } else {
                            android.util.Log.d(org.cocos2dx.plugin.PluginGoogleGame.this.TAG, "isAuth");
                            org.cocos2dx.plugin.PluginGoogleGame.this.getPlayer();
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private java.lang.Object getAchievementsClient() {
        android.content.Context context;
        if (this.achievementsClient == null && (context = mContext) != null) {
            this.achievementsClient = com.google.android.gms.games.PlayGames.getAchievementsClient((android.app.Activity) context);
        }
        return this.achievementsClient;
    }

    public void unlockAchievementById(java.lang.String str) {
        android.content.Context context = mContext;
        if (context == null) {
            return;
        }
        com.google.android.gms.games.PlayGames.getAchievementsClient((android.app.Activity) context).unlock(str);
    }

    public void incrementAchievementInfo(final org.json.JSONObject jSONObject) {
        android.content.Context context = mContext;
        if (context == null) {
            return;
        }
        final android.app.Activity activity = (android.app.Activity) context;
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginGoogleGame.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.google.android.gms.games.PlayGames.getAchievementsClient(activity).increment(jSONObject.getString("Param1"), jSONObject.getInt("Param2"));
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void showAchievementsUI() {
        android.content.Context context = mContext;
        if (context == null) {
            android.util.Log.d(this.TAG, "showAchievementsUI failed");
        } else {
            final android.app.Activity activity = (android.app.Activity) context;
            com.google.android.gms.games.PlayGames.getAchievementsClient(activity).getAchievementsIntent().addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener<android.content.Intent>() { // from class: org.cocos2dx.plugin.PluginGoogleGame.8
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(android.content.Intent intent) {
                    activity.startActivityForResult(intent, 9001);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: org.cocos2dx.plugin.PluginGoogleGame.7
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(java.lang.Exception exc) {
                    android.util.Log.e("Achievements", "Failed to show achievements UI", exc);
                }
            });
        }
    }
}
