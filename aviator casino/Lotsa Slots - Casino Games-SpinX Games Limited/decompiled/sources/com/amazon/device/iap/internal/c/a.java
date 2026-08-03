package com.amazon.device.iap.internal.c;

/* compiled from: PendingReceiptsManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3484a = "a";
    private static final java.lang.String b = com.amazon.device.iap.internal.c.a.class.getName() + "_PREFS";
    private static final java.lang.String c = com.amazon.device.iap.internal.c.a.class.getName() + "_CLEANER_PREFS";
    private static int d = 604800000;
    private static final com.amazon.device.iap.internal.c.a e = new com.amazon.device.iap.internal.c.a();

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.amazon.device.iap.internal.util.e.a(f3484a, "enter saveReceipt for receipt [" + str4 + com.ironsource.X3.j.e);
        try {
            com.amazon.device.iap.internal.util.d.a(str2, "userId");
            com.amazon.device.iap.internal.util.d.a(str3, "receiptId");
            com.amazon.device.iap.internal.util.d.a(str4, "receiptString");
            android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(b2, "context");
            com.amazon.device.iap.internal.c.d dVar = new com.amazon.device.iap.internal.c.d(str2, str4, str, java.lang.System.currentTimeMillis());
            android.content.SharedPreferences.Editor edit = b2.getSharedPreferences(b, 0).edit();
            edit.putString(str3, dVar.d());
            edit.commit();
        } catch (java.lang.Throwable th) {
            com.amazon.device.iap.internal.util.e.a(f3484a, "error in saving pending receipt:" + str + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + str4 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.e.a(f3484a, "leaving saveReceipt for receipt id [" + str3 + com.ironsource.X3.j.e);
    }

    private void e() {
        com.amazon.device.iap.internal.util.e.a(f3484a, "enter old receipts cleanup! ");
        final android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        a(java.lang.System.currentTimeMillis());
        new android.os.Handler().post(new java.lang.Runnable() { // from class: com.amazon.device.iap.internal.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.amazon.device.iap.internal.util.e.a(com.amazon.device.iap.internal.c.a.f3484a, "perform house keeping! ");
                    android.content.SharedPreferences sharedPreferences = b2.getSharedPreferences(com.amazon.device.iap.internal.c.a.b, 0);
                    for (java.lang.String str : sharedPreferences.getAll().keySet()) {
                        try {
                            if (java.lang.System.currentTimeMillis() - com.amazon.device.iap.internal.c.d.a(sharedPreferences.getString(str, null)).c() > com.amazon.device.iap.internal.c.a.d) {
                                com.amazon.device.iap.internal.util.e.a(com.amazon.device.iap.internal.c.a.f3484a, "house keeping - try remove Receipt:" + str + " since it's too old");
                                com.amazon.device.iap.internal.c.a.this.a(str);
                            }
                        } catch (com.amazon.device.iap.internal.c.e unused) {
                            com.amazon.device.iap.internal.util.e.a(com.amazon.device.iap.internal.c.a.f3484a, "house keeping - try remove Receipt:" + str + " since it's invalid ");
                            com.amazon.device.iap.internal.c.a.this.a(str);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.amazon.device.iap.internal.util.e.a(com.amazon.device.iap.internal.c.a.f3484a, "Error in running cleaning job:" + th);
                }
            }
        });
    }

    public void a(java.lang.String str) {
        java.lang.String str2 = f3484a;
        com.amazon.device.iap.internal.util.e.a(str2, "enter removeReceipt for receipt[" + str + com.ironsource.X3.j.e);
        android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        android.content.SharedPreferences.Editor edit = b2.getSharedPreferences(b, 0).edit();
        edit.remove(str);
        edit.commit();
        com.amazon.device.iap.internal.util.e.a(str2, "leave removeReceipt for receipt[" + str + com.ironsource.X3.j.e);
    }

    private long f() {
        android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = b2.getSharedPreferences(c, 0).getLong("LAST_CLEANING_TIME", 0L);
        if (j != 0) {
            return j;
        }
        a(currentTimeMillis);
        return currentTimeMillis;
    }

    private void a(long j) {
        android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        android.content.SharedPreferences.Editor edit = b2.getSharedPreferences(c, 0).edit();
        edit.putLong("LAST_CLEANING_TIME", j);
        edit.commit();
    }

    public java.util.Set<com.amazon.device.iap.model.Receipt> b(java.lang.String str) {
        android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        java.lang.String str2 = f3484a;
        com.amazon.device.iap.internal.util.e.a(str2, "enter getLocalReceipts for user[" + str + com.ironsource.X3.j.e);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            com.amazon.device.iap.internal.util.e.b(str2, "empty UserId: " + str);
            throw new java.lang.RuntimeException("Invalid UserId:" + str);
        }
        java.util.Map<java.lang.String, ?> all = b2.getSharedPreferences(b, 0).getAll();
        for (java.lang.String str3 : all.keySet()) {
            java.lang.String str4 = (java.lang.String) all.get(str3);
            try {
                com.amazon.device.iap.internal.c.d a2 = com.amazon.device.iap.internal.c.d.a(str4);
                hashSet.add(com.amazon.device.iap.internal.util.a.a(new org.json.JSONObject(a2.b()), str, a2.a()));
            } catch (com.amazon.device.iap.internal.b.d unused) {
                a(str3);
                com.amazon.device.iap.internal.util.e.b(f3484a, "failed to verify signature:[" + str4 + com.ironsource.X3.j.e);
            } catch (org.json.JSONException unused2) {
                a(str3);
                com.amazon.device.iap.internal.util.e.b(f3484a, "failed to convert string to JSON object:[" + str4 + com.ironsource.X3.j.e);
            } catch (java.lang.Throwable unused3) {
                com.amazon.device.iap.internal.util.e.b(f3484a, "failed to load the receipt from SharedPreference:[" + str4 + com.ironsource.X3.j.e);
            }
        }
        com.amazon.device.iap.internal.util.e.a(f3484a, "leaving getLocalReceipts for user[" + str + "], " + hashSet.size() + " local receipts found.");
        if (java.lang.System.currentTimeMillis() - f() > d) {
            e();
        }
        return hashSet;
    }

    public static com.amazon.device.iap.internal.c.a a() {
        return e;
    }

    public java.lang.String c(java.lang.String str) {
        android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            com.amazon.device.iap.internal.util.e.b(f3484a, "empty receiptId: " + str);
            throw new java.lang.RuntimeException("Invalid ReceiptId:" + str);
        }
        java.lang.String string = b2.getSharedPreferences(b, 0).getString(str, null);
        if (string != null) {
            try {
                return com.amazon.device.iap.internal.c.d.a(string).a();
            } catch (com.amazon.device.iap.internal.c.e unused) {
            }
        }
        return null;
    }
}
