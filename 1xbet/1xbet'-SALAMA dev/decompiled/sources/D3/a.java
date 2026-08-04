package D3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements l {
    public abstract boolean a(char c3);

    @Override // D3.l
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
