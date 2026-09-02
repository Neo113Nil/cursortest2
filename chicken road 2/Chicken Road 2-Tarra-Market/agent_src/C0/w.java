package C0;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f137b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139d;

    /* renamed from: e, reason: collision with root package name */
    public final int f140e;

    public w(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i4 + ", " + i5 + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException(g.g(i4, "invalid composing start: "));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(g.g(i2, "invalid selection start: "));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(g.g(i3, "invalid selection end: "));
        }
        this.f136a = str;
        this.f137b = i2;
        this.f138c = i3;
        this.f139d = i4;
        this.f140e = i5;
    }

    public static w a(JSONObject jSONObject) {
        return new w(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
