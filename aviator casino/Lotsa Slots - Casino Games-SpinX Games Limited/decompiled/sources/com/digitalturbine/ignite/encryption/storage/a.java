package com.digitalturbine.ignite.encryption.storage;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f3515a;
    public final com.digitalturbine.ignite.encryption.c b = new com.digitalturbine.ignite.encryption.c();

    public a(android.content.Context context) {
        this.f3515a = context.getSharedPreferences("odt_storage", 0);
    }

    public final void a(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            com.digitalturbine.ignite.authenticator.logger.a.b("Won't cache - low Android version", new java.lang.Object[0]);
            return;
        }
        try {
            android.util.Pair a2 = this.b.a(str);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(a2.first).put(a2.second);
            this.f3515a.edit().putString("odt", jSONArray.toString()).apply();
        } catch (java.io.IOException e) {
            e = e;
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            e = e2;
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (java.security.InvalidKeyException e3) {
            e = e3;
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (java.security.NoSuchAlgorithmException e4) {
            e = e4;
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (javax.crypto.NoSuchPaddingException e5) {
            e = e5;
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (java.lang.Exception e6) {
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e6, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
        }
    }

    public final java.lang.String a() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            com.digitalturbine.ignite.authenticator.logger.a.b("Can't retrieve cached data - low Android version", new java.lang.Object[0]);
            return "";
        }
        java.lang.String string = this.f3515a.getString("odt", null);
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                java.lang.String string2 = jSONArray.getString(0);
                return this.b.a(jSONArray.getString(1), android.util.Base64.decode(string2, 0));
            } catch (java.io.IOException e) {
                e = e;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (java.security.InvalidAlgorithmParameterException e2) {
                e = e2;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (java.security.InvalidKeyException e3) {
                e = e3;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (java.security.NoSuchAlgorithmException e4) {
                e = e4;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (javax.crypto.NoSuchPaddingException e5) {
                e = e5;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (org.json.JSONException e6) {
                e = e6;
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (java.lang.Exception e7) {
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, com.digitalturbine.ignite.authenticator.utils.events.a.a(e7, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            }
        }
        return "";
    }
}
