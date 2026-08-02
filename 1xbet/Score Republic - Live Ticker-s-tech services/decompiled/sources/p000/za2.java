package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class za2 implements ab2 {

    /* JADX INFO: renamed from: a */
    public static final xa2 f9717a = new xa2();

    /* JADX INFO: renamed from: a */
    public abstract String mo5614a();

    /* JADX INFO: renamed from: b */
    public abstract String mo5615b();

    /* JADX INFO: renamed from: c */
    public abstract int mo5616c();

    /* JADX INFO: renamed from: d */
    public abstract String mo5617d();

    /* JADX INFO: renamed from: e */
    public String mo5752e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(mo5614a());
        sb.append(", method=");
        sb.append(mo5615b());
        sb.append(", line=");
        sb.append(mo5616c());
        if (mo5617d() != null) {
            sb.append(", file=");
            sb.append(mo5617d());
        }
        if (mo5752e() != null) {
            sb.append(", filePath=");
            sb.append(mo5752e());
        }
        sb.append(" }");
        return sb.toString();
    }
}
