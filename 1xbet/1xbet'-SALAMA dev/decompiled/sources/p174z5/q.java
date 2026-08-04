package p174z5;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18530e;

    public q(String str, int i7, int i8, int i9, int i10) {
        if (!(i7 == -1 && i8 == -1) && (i7 < 0 || i8 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i7) + ", " + String.valueOf(i8) + ")");
        }
        if (!(i9 == -1 && i10 == -1) && (i9 < 0 || i9 > i10)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i9) + ", " + String.valueOf(i10) + ")");
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i9));
        }
        if (i7 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i7));
        }
        if (i8 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i8));
        }
        this.f18526a = str;
        this.f18527b = i7;
        this.f18528c = i8;
        this.f18529d = i9;
        this.f18530e = i10;
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
