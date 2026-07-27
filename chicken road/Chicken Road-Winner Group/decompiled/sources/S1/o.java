package S1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1455c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1456d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1457e;

    public o(String str, int i3, int i4, int i5, int i6) {
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i3 + ", " + i4 + ")");
        }
        if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i5 + ", " + i6 + ")");
        }
        if (i6 > str.length()) {
            throw new IndexOutOfBoundsException(B0.c.h(i5, "invalid composing start: "));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(B0.c.h(i3, "invalid selection start: "));
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException(B0.c.h(i4, "invalid selection end: "));
        }
        this.f1453a = str;
        this.f1454b = i3;
        this.f1455c = i4;
        this.f1456d = i5;
        this.f1457e = i6;
    }

    public static o a(JSONObject jSONObject) {
        return new o(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
