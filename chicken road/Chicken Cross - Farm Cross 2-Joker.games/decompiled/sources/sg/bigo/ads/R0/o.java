package sg.bigo.ads.R0;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class o implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12523a;

    public o(String str) {
        this.f12523a = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        return (sVar != null && sVar.d && sVar.c && TextUtils.equals(sVar.f, this.f12523a)) ? 1 : 0;
    }
}
