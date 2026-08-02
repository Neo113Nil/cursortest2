package androidx.content;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Context;", "", "fileName", "Ljava/io/File;", "dataStoreFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.datastore.DataStoreFile, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class Context {
    public static final java.io.File dataStoreFile(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/".concat(java.lang.String.valueOf(str)));
    }
}
