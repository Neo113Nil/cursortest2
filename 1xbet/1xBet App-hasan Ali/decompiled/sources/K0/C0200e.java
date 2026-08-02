package K0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: K0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200e implements Appendable {

    /* renamed from: k, reason: collision with root package name */
    public final StringBuilder f2821k = new StringBuilder(16);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2822l;

    public C0200e(C0203h c0203h) {
        new ArrayList();
        this.f2822l = new ArrayList();
        new ArrayList();
        a(c0203h);
    }

    public final void a(C0203h c0203h) {
        StringBuilder sb = this.f2821k;
        int length = sb.length();
        sb.append(c0203h.f2829l);
        List list = c0203h.f2828k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0201f c0201f = (C0201f) list.get(i);
                this.f2822l.add(new C0199d(c0201f.f2823a, c0201f.f2824b + length, c0201f.f2825c + length, c0201f.f2826d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0203h) {
            a((C0203h) charSequence);
            return this;
        }
        this.f2821k.append(charSequence);
        return this;
    }

    public final C0203h b() {
        StringBuilder sb = this.f2821k;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f2822l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0199d c0199d = (C0199d) arrayList.get(i);
            int length = sb.length();
            int i5 = c0199d.f2819c;
            if (i5 != Integer.MIN_VALUE) {
                length = i5;
            }
            if (length == Integer.MIN_VALUE) {
                Q0.a.b("Item.end should be set first");
            }
            arrayList2.add(new C0201f(c0199d.f2817a, c0199d.f2818b, length, c0199d.f2820d));
        }
        return new C0203h(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i5) {
        boolean z3 = charSequence instanceof C0203h;
        StringBuilder sb = this.f2821k;
        if (z3) {
            C0203h c0203h = (C0203h) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0203h.f2829l, i, i5);
            List a5 = AbstractC0205j.a(c0203h, i, i5, null);
            if (a5 != null) {
                int size = a5.size();
                for (int i6 = 0; i6 < size; i6++) {
                    C0201f c0201f = (C0201f) a5.get(i6);
                    this.f2822l.add(new C0199d(c0201f.f2823a, c0201f.f2824b + length, c0201f.f2825c + length, c0201f.f2826d));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i5);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c5) {
        this.f2821k.append(c5);
        return this;
    }
}
