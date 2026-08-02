package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class SNWrapper {
    private static final java.lang.String TAG = "SNWrapper";
    private static android.content.Context localContext;
    private static java.lang.Object snImpl$182bf91f;
    private static com.visa.cbp.sdk.facade.SNWrapper snWrapper;

    public static com.visa.cbp.sdk.facade.SNWrapper getInstance(android.content.Context context) {
        localContext = context;
        if (snWrapper == null && com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(localContext) == 0) {
            snWrapper = new com.visa.cbp.sdk.facade.SNWrapper();
            try {
                java.lang.Object obj = com.visa.cbp.getWidth.AidInfo.get(270583307);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(32 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.getOffsetAfter("", 0) + 59)).getDeclaredConstructor(null);
                    com.visa.cbp.getWidth.AidInfo.put(270583307, obj);
                }
                snImpl$182bf91f = ((java.lang.reflect.Constructor) obj).newInstance(null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return snWrapper;
    }

    public final void verifyApps(final com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback verifyAppsCallback) {
        java.lang.Object obj = snImpl$182bf91f;
        try {
            java.lang.Object[] objArr = {localContext};
            java.lang.Object obj2 = com.visa.cbp.getWidth.AidInfo.get(-2120668359);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 32, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58)).getMethod("valueOf", android.content.Context.class);
                com.visa.cbp.getWidth.AidInfo.put(-2120668359, obj2);
            }
            ((com.google.android.gms.tasks.Task) ((java.lang.reflect.Method) obj2).invoke(obj, objArr)).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse>() { // from class: com.visa.cbp.sdk.facade.SNWrapper.2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse> task) {
                    java.lang.Object obj3 = com.visa.cbp.sdk.facade.SNWrapper.snImpl$182bf91f;
                    try {
                        java.lang.Object[] objArr2 = {task, verifyAppsCallback};
                        java.lang.Object obj4 = com.visa.cbp.getWidth.AidInfo.get(-1603996562);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(android.graphics.Color.green(0) + 31, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.KeyEvent.keyCodeFromString("") + 59)).getMethod("ReplenishAckRequest", com.google.android.gms.tasks.Task.class, com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback.class);
                            com.visa.cbp.getWidth.AidInfo.put(-1603996562, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(obj3, objArr2);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.visa.cbp.sdk.facade.SNWrapper.1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(java.lang.Exception exc) {
                    verifyAppsCallback.onError(1000, exc);
                }
            });
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void enableVerifyApps(final com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback verifyAppsCallback) {
        java.lang.Object obj = snImpl$182bf91f;
        try {
            java.lang.Object[] objArr = {localContext};
            java.lang.Object obj2 = com.visa.cbp.getWidth.AidInfo.get(2128057845);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(31 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58)).getMethod("ReplenishAckRequest", android.content.Context.class);
                com.visa.cbp.getWidth.AidInfo.put(2128057845, obj2);
            }
            ((com.google.android.gms.tasks.Task) ((java.lang.reflect.Method) obj2).invoke(obj, objArr)).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse>() { // from class: com.visa.cbp.sdk.facade.SNWrapper.3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse> task) {
                    java.lang.Object obj3 = com.visa.cbp.sdk.facade.SNWrapper.snImpl$182bf91f;
                    try {
                        java.lang.Object[] objArr2 = {task, verifyAppsCallback};
                        java.lang.Object obj4 = com.visa.cbp.getWidth.AidInfo.get(-147743182);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 59 - (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("BuildConfig", com.google.android.gms.tasks.Task.class, com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback.class);
                            com.visa.cbp.getWidth.AidInfo.put(-147743182, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(obj3, objArr2);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            });
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void listHarmfulApps(final com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback harmfulAppsCallback) {
        java.lang.Object obj = snImpl$182bf91f;
        try {
            java.lang.Object[] objArr = {localContext};
            java.lang.Object obj2 = com.visa.cbp.getWidth.AidInfo.get(294699697);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(android.text.TextUtils.indexOf("", "", 0, 0) + 31, (char) android.graphics.Color.green(0), 59 - android.text.TextUtils.getTrimmedLength(""))).getMethod("BuildConfig", android.content.Context.class);
                com.visa.cbp.getWidth.AidInfo.put(294699697, obj2);
            }
            ((com.google.android.gms.tasks.Task) ((java.lang.reflect.Method) obj2).invoke(obj, objArr)).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResponse>() { // from class: com.visa.cbp.sdk.facade.SNWrapper.5
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResponse> task) {
                    java.lang.Object obj3 = com.visa.cbp.sdk.facade.SNWrapper.snImpl$182bf91f;
                    try {
                        java.lang.Object[] objArr2 = {task, harmfulAppsCallback};
                        java.lang.Object obj4 = com.visa.cbp.getWidth.AidInfo.get(331674761);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.Gravity.getAbsoluteGravity(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 59)).getMethod("ConfirmReplenishRequest", com.google.android.gms.tasks.Task.class, com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback.class);
                            com.visa.cbp.getWidth.AidInfo.put(331674761, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(obj3, objArr2);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.visa.cbp.sdk.facade.SNWrapper.4
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(java.lang.Exception exc) {
                    harmfulAppsCallback.onError(3000, exc);
                }
            });
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void deviceAttestation(final com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback deviceAttestationCallback, java.lang.String str) {
        java.lang.Object obj = snImpl$182bf91f;
        try {
            java.lang.Object[] objArr = {localContext, str};
            java.lang.Object obj2 = com.visa.cbp.getWidth.AidInfo.get(1121144375);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 31, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 59)).getMethod("ReplenishAckRequest", android.content.Context.class, java.lang.String.class);
                com.visa.cbp.getWidth.AidInfo.put(1121144375, obj2);
            }
            ((com.google.android.gms.tasks.Task) ((java.lang.reflect.Method) obj2).invoke(obj, objArr)).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<com.google.android.play.core.integrity.IntegrityTokenResponse>() { // from class: com.visa.cbp.sdk.facade.SNWrapper.7
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> task) {
                    java.lang.Object obj3 = com.visa.cbp.sdk.facade.SNWrapper.snImpl$182bf91f;
                    try {
                        java.lang.Object[] objArr2 = {task, deviceAttestationCallback};
                        java.lang.Object obj4 = com.visa.cbp.getWidth.AidInfo.get(1891675400);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(31 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 60 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("ConfirmReplenishRequest", com.google.android.gms.tasks.Task.class, com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback.class);
                            com.visa.cbp.getWidth.AidInfo.put(1891675400, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(obj3, objArr2);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.visa.cbp.sdk.facade.SNWrapper.6
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(java.lang.Exception exc) {
                    deviceAttestationCallback.onError(4000, exc);
                }
            });
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
