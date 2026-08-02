package androidx.core.app;

import android.app.RemoteInput;

/* loaded from: classes8.dex */
public final class s {

    static class a {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i11) {
            return builder.setEditChoicesBeforeSending(i11);
        }
    }
}
