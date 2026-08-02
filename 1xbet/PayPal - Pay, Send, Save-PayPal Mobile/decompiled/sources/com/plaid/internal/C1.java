package com.plaid.internal;

/* loaded from: classes3.dex */
public final class C1 {
    public static final com.plaid.internal.D6 a(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        if (intent.getBooleanExtra("redirect_error", false)) {
            java.io.Serializable serializableExtra = intent.getSerializableExtra("redirect_error_exception");
            return new com.plaid.internal.D6.d(serializableExtra != null ? (java.lang.Exception) serializableExtra : new java.lang.RuntimeException("Unknown oauth redirect exception"));
        }
        if (!intent.hasExtra("link_oauth_redirect") && !intent.hasExtra("link_out_of_process_complete_redirect") && !intent.hasExtra("link_out_of_process_closed_redirect_uri") && !intent.hasExtra("link_resume_redirect")) {
            return null;
        }
        if (intent.hasExtra("link_out_of_process_closed_redirect_uri")) {
            return new com.plaid.internal.D6.c();
        }
        if (intent.hasExtra("link_resume_redirect")) {
            return new com.plaid.internal.D6.e();
        }
        java.lang.String stringExtra = intent.getStringExtra("link_oauth_received_redirect_uri");
        if (stringExtra != null) {
            return new com.plaid.internal.D6.a(stringExtra);
        }
        java.lang.String stringExtra2 = intent.getStringExtra("link_out_of_process_complete_redirect_uri");
        return stringExtra2 != null ? new com.plaid.internal.D6.b(stringExtra2) : new com.plaid.internal.D6.d(new java.lang.RuntimeException("Redirect uri cannot be null"));
    }
}
