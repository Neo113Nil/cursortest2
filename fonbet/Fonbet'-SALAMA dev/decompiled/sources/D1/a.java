package D1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1674a;

    /* renamed from: b, reason: collision with root package name */
    public int f1675b;

    public a(int i7, byte b7) {
        this.f1674a = i7;
        switch (i7) {
            case 2:
                this.f1675b = 1;
                break;
        }
    }

    public static String c(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int l(int i7) {
        return (i7 >> 24) & 255;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fl.frame.version", this.f1675b);
        return jSONObject;
    }

    public void b(int i7) {
        this.f1675b = i7 | this.f1675b;
    }

    public boolean f(int i7) {
        return (this.f1675b & i7) == i7;
    }

    public String toString() {
        switch (this.f1674a) {
            case 1:
                return c(this.f1675b);
            default:
                return super.toString();
        }
    }

    public a(int i7) {
        this.f1674a = 1;
        this.f1675b = i7;
    }
}
