package com.google.android.gms.auth.api.identity;

import kotlin.jvm.functions.Function1;

/* renamed from: com.google.android.gms.auth.api.identity.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0808b {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "account_selection_token";
            case 2:
                return "account_selection_state";
            case 3:
                return "allow_multiple";
            case 4:
                return "mimetypes";
            case 5:
                return "file_ids";
            case 6:
                return "trigger_onepick";
            default:
                throw null;
        }
    }

    public static Object b(CharSequence charSequence, int i, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i)));
    }
}
