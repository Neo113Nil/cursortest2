package com.plaid.internal;

@kotlin.Deprecated(message = "Stores everything in the root of the host app, which is discouraged.Use [PlaidDirectoryStorage] instead")
/* loaded from: classes3.dex */
public final class H5 {
    public static final com.plaid.internal.H5.a b = new com.plaid.internal.H5.a();
    public static volatile com.plaid.internal.H5 c;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5800a;

    public static final class a {
    }

    public H5(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f5800a = context.getApplicationContext();
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.io.File filesDir = this.f5800a.getFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filesDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        java.io.File file = new java.io.File(filesDir, str);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        kotlin.io.FilesKt.writeText$default(file, str2, null, 2, null);
    }

    public final void a() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("plaid_link_state", "");
        java.io.File file = new java.io.File(this.f5800a.getFilesDir().toString(), "plaid_link_state");
        if (file.exists()) {
            file.delete();
        }
    }
}
