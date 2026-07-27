package sg.bigo.ads.f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.webkit.WebView;
import com.ironsource.U3;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4962t;

/* renamed from: sg.bigo.ads.f.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5100e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f12763a;
    public final /* synthetic */ C5111p b;

    public RunnableC5100e(C5111p c5111p, sg.bigo.ads.E1.f fVar) {
        this.b = c5111p;
        this.f12763a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.E1.d dVar;
        ArrayList arrayList;
        long elapsedRealtime;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        C5096a c5096a;
        C5096a c5096a2;
        sg.bigo.ads.E1.f fVar = (sg.bigo.ads.E1.f) this.f12763a;
        fVar.getClass();
        boolean z = true;
        if (sg.bigo.ads.O.g.f12472a.B.a(0) || sg.bigo.ads.O.g.f12472a.B.a(1)) {
            dVar = fVar.e;
            if (sg.bigo.ads.O.g.f12472a.B.a(0) && (arrayList = dVar.f12279a) != null && !arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.startsWith(U3.j.d)) {
                        sb.append(str.substring(1, str.length() - 1)).append(",");
                    }
                    sb.append(str).append(",");
                }
                try {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray(U3.j.d + sb.substring(0, sb.length() - 1) + U3.j.e);
                    int length = jSONArray2.length();
                    JSONObject jSONObject = null;
                    JSONObject jSONObject2 = null;
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("type");
                            if ("render_start".equals(optString)) {
                                jSONObject = optJSONObject;
                            }
                            if ("render".equals(optString) && jSONObject2 == null) {
                                jSONObject2 = optJSONObject;
                            }
                            if ("mayError".equals(optString)) {
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                                if (optJSONObject2 != null) {
                                    String optString2 = optJSONObject2.optString("url");
                                    ArrayList arrayList2 = dVar.b;
                                    if (optString2 != null && arrayList2 != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            if (optString2.equals((String) it2.next())) {
                                            }
                                        }
                                    }
                                }
                            }
                            jSONArray.put(optJSONObject);
                            break;
                        }
                    }
                    if (jSONArray.length() > 0) {
                        sg.bigo.ads.s1.b.a(3002, 10113, jSONArray.toString(), (sg.bigo.ads.P.c) null);
                    }
                    if (jSONObject != null) {
                        if (jSONObject2 != null) {
                            dVar.c = Boolean.TRUE;
                            elapsedRealtime = jSONObject2.optLong(BidResponsed.KEY_CUR);
                        } else {
                            dVar.c = Boolean.FALSE;
                            elapsedRealtime = SystemClock.elapsedRealtime();
                        }
                        dVar.e = elapsedRealtime;
                    }
                } catch (Exception unused) {
                }
            }
            if (sg.bigo.ads.O.g.f12472a.B.a(1)) {
                if (fVar.f == null) {
                    fVar.f = new sg.bigo.ads.E1.e(fVar);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                sg.bigo.ads.E1.e eVar = fVar.f;
                Boolean bool = eVar.f12280a;
                if (bool == null) {
                    sg.bigo.ads.E1.f fVar2 = eVar.b;
                    if (!fVar2.f12281a) {
                        int width = fVar2.getWidth();
                        int height = eVar.b.getHeight();
                        if (width > 0 && height > 0) {
                            int i2 = width * height;
                            try {
                                int[] iArr = new int[i2];
                                Bitmap a2 = AbstractC4962t.a(width, height, Bitmap.Config.RGB_565);
                                if (a2 != null) {
                                    eVar.b.draw(new Canvas(a2));
                                    a2.getPixels(iArr, 0, width, 0, 0, width, height);
                                    a2.recycle();
                                    if (i2 > 0) {
                                        int i3 = i2 - 1;
                                        int i4 = 0;
                                        while (true) {
                                            int i5 = i2 / 2;
                                            if (i4 >= i5 || i3 < i5) {
                                                break;
                                            }
                                            if (iArr[i4] != iArr[i3]) {
                                                break;
                                            }
                                            i4++;
                                            i3--;
                                        }
                                        z = false;
                                    }
                                    bool = Boolean.valueOf(z);
                                    eVar.f12280a = bool;
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    bool = null;
                }
                dVar.d = bool;
                dVar.g = SystemClock.elapsedRealtime() - elapsedRealtime2;
                dVar.f = SystemClock.elapsedRealtime();
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Boolean bool2 = dVar.c;
            if (bool2 == null && dVar.d == null) {
                return;
            }
            Boolean bool3 = dVar.d;
            long j6 = -1;
            if (bool2 != null) {
                j2 = bool2.booleanValue() ? 1L : 0L;
                C5111p c5111p = this.b;
                long j7 = dVar.e;
                if (j7 == -1) {
                    WeakHashMap weakHashMap = AbstractC5098c.f12761a;
                    j = -1;
                } else {
                    WeakHashMap weakHashMap2 = AbstractC5098c.f12761a;
                    C5096a c5096a3 = (C5096a) weakHashMap2.get(c5111p);
                    if (c5096a3 == null) {
                        c5096a2 = new C5096a();
                        weakHashMap2.put(c5111p, c5096a2);
                    } else {
                        c5096a2 = c5096a3;
                    }
                    j = j7 - c5096a2.f12760a[4];
                }
            } else {
                j = -1;
                j2 = -1;
            }
            if (bool3 != null) {
                j5 = bool3.booleanValue() ? 1L : 0L;
                j4 = dVar.g;
                C5111p c5111p2 = this.b;
                long j8 = dVar.f;
                if (j8 == -1) {
                    WeakHashMap weakHashMap3 = AbstractC5098c.f12761a;
                    j3 = -1;
                } else {
                    WeakHashMap weakHashMap4 = AbstractC5098c.f12761a;
                    C5096a c5096a4 = (C5096a) weakHashMap4.get(c5111p2);
                    if (c5096a4 == null) {
                        c5096a = new C5096a();
                        weakHashMap4.put(c5111p2, c5096a);
                    } else {
                        c5096a = c5096a4;
                    }
                    j3 = j8 - c5096a.f12760a[4];
                }
            } else {
                j3 = -1;
                j4 = -1;
                j5 = -1;
            }
            HashMap a3 = sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) this.b.m, (sg.bigo.ads.Q.b) null, false);
            a3.put("by_js", String.valueOf(j2));
            a3.put("by_js_cost", String.valueOf(j));
            a3.put("by_bit", String.valueOf(j5));
            a3.put("by_bit_cost", String.valueOf(j3));
            a3.put("by_bit_run_cost", String.valueOf(j4));
            if (j2 > 0 && j >= 0 && j5 > 0 && j3 >= 0) {
                j6 = Math.min(j, j3);
            } else if (j2 > 0 && j >= 0) {
                j6 = j;
            } else if (j5 > 0 && j3 >= 0) {
                j6 = j3;
            }
            a3.put("cost", String.valueOf(j6));
            sg.bigo.ads.s1.b.a("06002040", a3);
        }
    }
}
