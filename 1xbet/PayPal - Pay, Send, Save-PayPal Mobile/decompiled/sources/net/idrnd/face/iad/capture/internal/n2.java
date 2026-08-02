package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes17.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final net.idrnd.face.iad.capture.internal.n2 f6990a;
    public static final net.idrnd.face.iad.capture.internal.n2 b;
    public static final net.idrnd.face.iad.capture.internal.n2 c;
    public static final /* synthetic */ net.idrnd.face.iad.capture.internal.n2[] d;

    static {
        net.idrnd.face.iad.capture.internal.n2 n2Var = new net.idrnd.face.iad.capture.internal.n2("Normal", 0);
        f6990a = n2Var;
        net.idrnd.face.iad.capture.internal.n2 n2Var2 = new net.idrnd.face.iad.capture.internal.n2("Small", 1);
        b = n2Var2;
        net.idrnd.face.iad.capture.internal.n2 n2Var3 = new net.idrnd.face.iad.capture.internal.n2("DataCollecting", 2);
        c = n2Var3;
        net.idrnd.face.iad.capture.internal.n2[] n2VarArr = {n2Var, n2Var2, n2Var3};
        d = n2VarArr;
        kotlin.enums.EnumEntriesKt.enumEntries(n2VarArr);
    }

    public static net.idrnd.face.iad.capture.internal.n2 valueOf(java.lang.String str) {
        return (net.idrnd.face.iad.capture.internal.n2) java.lang.Enum.valueOf(net.idrnd.face.iad.capture.internal.n2.class, str);
    }

    public static net.idrnd.face.iad.capture.internal.n2[] values() {
        return (net.idrnd.face.iad.capture.internal.n2[]) d.clone();
    }

    public n2(java.lang.String str, int i) {
    }
}
