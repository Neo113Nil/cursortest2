package t6;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static String a(f fVar) {
        String string = fVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
