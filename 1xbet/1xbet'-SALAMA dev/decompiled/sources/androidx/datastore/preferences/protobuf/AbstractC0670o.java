package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0670o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0669n f9225a = new C0669n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0669n f9226b;

    static {
        Q q7 = Q.f9136c;
        C0669n c0669n = null;
        try {
            c0669n = (C0669n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9226b = c0669n;
    }
}
