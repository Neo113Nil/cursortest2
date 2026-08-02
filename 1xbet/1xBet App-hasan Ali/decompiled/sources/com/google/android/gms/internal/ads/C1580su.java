package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.su, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580su extends AbstractC1715vu {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15611p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15612q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1580su(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.f15611p = i;
        this.f15612q = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1715vu
    public final int a(int i) {
        switch (this.f15611p) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((Dp) this.f15612q).f8377l).end();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1715vu
    public final int b(int i) {
        switch (this.f15611p) {
            case 0:
                CharSequence charSequence = this.f16062m;
                int length = charSequence.length();
                AbstractC1400ot.B(i, length);
                while (i < length) {
                    if (((C1221ku) this.f15612q).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Dp dp = (Dp) this.f15612q;
                if (((Matcher) dp.f8377l).find(i)) {
                    return ((Matcher) dp.f8377l).start();
                }
                return -1;
        }
    }
}
