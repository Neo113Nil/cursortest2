package L5;

/* loaded from: classes8.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    c(String str) {
        this.extension = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.extension;
    }
}
