package D;

import org.json.JSONObject;

/* renamed from: D.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f245b;

    /* renamed from: c, reason: collision with root package name */
    public int f246c;

    public /* synthetic */ C0009j() {
    }

    public String toString() {
        switch (this.f244a) {
            case 1:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f245b + ", mEndLine=" + this.f246c + '}';
            default:
                return super.toString();
        }
    }

    public C0009j(JSONObject jSONObject) {
        this.f245b = jSONObject.getInt("commitmentPaymentsCount");
        this.f246c = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }

    public C0009j(int i3, int i4) {
        this.f245b = i3;
        this.f246c = i4;
    }
}
