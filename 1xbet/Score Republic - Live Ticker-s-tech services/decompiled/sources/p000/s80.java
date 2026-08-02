package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 implements Appendable {

    /* JADX INFO: renamed from: j */
    public final Appendable f7049j;

    /* JADX INFO: renamed from: k */
    public boolean f7050k = true;

    public s80(Appendable appendable) {
        this.f7049j = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f7050k;
        Appendable appendable = this.f7049j;
        boolean z2 = false;
        if (z) {
            this.f7050k = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f7050k = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f7050k;
        Appendable appendable = this.f7049j;
        if (z) {
            this.f7050k = false;
            appendable.append("  ");
        }
        this.f7050k = c == '\n';
        appendable.append(c);
        return this;
    }
}
