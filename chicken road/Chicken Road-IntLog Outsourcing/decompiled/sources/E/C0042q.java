package E;

import org.json.JSONObject;

/* renamed from: E.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f630a;

    /* renamed from: b, reason: collision with root package name */
    public int f631b;

    /* renamed from: c, reason: collision with root package name */
    public int f632c;

    public String toString() {
        switch (this.f630a) {
            case 2:
                StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
                sb.append(0);
                sb.append(", mCurrentPosition=");
                sb.append(0);
                sb.append(", mItemDirection=");
                sb.append(0);
                sb.append(", mLayoutDirection=");
                sb.append(0);
                sb.append(", mStartLine=");
                sb.append(this.f631b);
                sb.append(", mEndLine=");
                return B0.o.k(sb, this.f632c, '}');
            default:
                return super.toString();
        }
    }

    public C0042q(JSONObject jSONObject) {
        this.f630a = 1;
        this.f631b = jSONObject.getInt("commitmentPaymentsCount");
        this.f632c = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }

    public C0042q(int i2, int i3) {
        this.f630a = 3;
        this.f631b = i2;
        this.f632c = i3;
    }
}
