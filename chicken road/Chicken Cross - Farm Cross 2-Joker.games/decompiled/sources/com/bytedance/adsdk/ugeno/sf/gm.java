package com.bytedance.adsdk.ugeno.sf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.dax;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.kj;
import com.bytedance.adsdk.ugeno.core.lu;
import com.bytedance.adsdk.ugeno.core.ork;
import com.bytedance.adsdk.ugeno.core.qf;
import com.bytedance.adsdk.ugeno.core.sf.oo;
import com.bytedance.adsdk.ugeno.core.sf.vj;
import com.bytedance.adsdk.ugeno.core.vh;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.oo.gbb;
import com.bytedance.adsdk.ugeno.oo.vy;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.pcc.wh;
import com.bytedance.adsdk.ugeno.qf.pcc;
import com.bytedance.adsdk.ugeno.sf.pcc;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class gm<T extends View> implements View.OnTouchListener, jr.pcc, jr.sf, oo {
    protected float atb;
    private boolean az;
    protected float bbd;
    protected int bg;
    private boolean bgf;
    private boolean bq;
    protected boolean bxz;

    @Deprecated
    private vj by;
    private com.bytedance.adsdk.ugeno.oo.pcc.pcc ct;
    private boolean cz;
    protected float dax;
    private boolean dp;
    private boolean dt;
    protected float ei;
    private ork eko;
    protected boolean erj;
    private boolean esn;
    protected boolean ew;
    protected float fmh;
    protected float fum;
    protected jr fvk;
    protected Map<Integer, hc> fy;
    protected float gbb;
    protected boolean gd;
    protected wh gdh;
    private boolean gga;
    protected com.bytedance.adsdk.ugeno.pcc.pcc gh;
    protected JSONObject gm;
    private boolean gmh;
    private boolean gpa;
    protected float gpj;
    protected kj gqd;
    private GradientDrawable gr;
    private boolean gye;
    protected float hc;
    private boolean hl;
    protected float hoh;
    protected float hpk;
    protected boolean iv;
    private com.bytedance.adsdk.ugeno.core.pcc jmx;
    protected float jq;
    protected float jr;
    protected float jsj;
    protected vy jy;
    private boolean kez;
    protected qf.pcc kj;
    protected ImageView.ScaleType kun;
    protected pcc.C0108pcc kx;
    protected float kz;
    private lu lc;

    @Deprecated
    private oo.pcc ln;
    protected float lo;
    protected boolean lq;
    protected boolean lrr;
    protected float lu;
    private com.bytedance.adsdk.ugeno.oo.hc luz;
    protected float mk;
    protected boolean mu;
    protected dax mua;
    protected float nac;
    protected boolean nn;
    private gbb oa;
    protected boolean of;
    private boolean ofe;
    protected JSONObject oo;
    protected boolean ork;
    protected float otd;
    private String oyx;
    private boolean pcc;
    protected boolean pq;
    protected boolean ptr;
    protected float pv;
    private boolean pzh;
    protected float qc;
    protected int qcw;
    protected pcc<ViewGroup> qf;
    private float qxq;
    protected boolean qy;
    protected float ra;
    private boolean rc;
    protected float ri;
    protected float rj;
    protected int rnn;
    protected float rt;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.sf.sf rv;
    protected boolean se;
    protected Context sf;
    protected String tmg;
    protected ViewGroup.LayoutParams tmh;
    protected String tsx;
    protected float tsz;
    protected boolean tz;
    private boolean uae;
    private boolean vd;
    protected float vgx;
    protected String vh;
    protected T vj;
    protected com.bytedance.adsdk.ugeno.core.wh vo;
    protected String vr;
    protected vh vy;
    protected float wax;
    protected pcc<ViewGroup> wh;
    private long wjv;
    protected float xb;
    private boolean xf;
    private JSONObject xfm;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.sf.gm xy;
    protected float ye;
    protected boolean yt;
    private boolean ywc;
    protected float ywp;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.sf.wh zk;
    private String zpi;
    protected float zsj;
    protected boolean zti;

    protected void iv() {
    }

    protected void lrr() {
    }

    public T pcc() {
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void pcc(String str, Map<String, Object> map) {
    }

    public gm(Context context) {
        this(context, null);
    }

    public gm(Context context, pcc<ViewGroup> pccVar) {
        this.hc = -2.0f;
        this.gbb = -2.0f;
        this.vr = "solid";
        this.bg = 0;
        this.ew = true;
        this.otd = 0.0f;
        this.ei = 0.0f;
        this.vgx = 0.0f;
        this.ywp = 1.0f;
        this.ra = 1.0f;
        this.rt = 1.0f;
        this.qc = 0.0f;
        this.wax = 0.0f;
        this.bbd = 0.0f;
        this.pv = 0.0f;
        this.jq = 1.0f;
        this.gpa = true;
        this.gye = true;
        this.dt = false;
        this.hl = false;
        this.ywc = false;
        this.cz = false;
        this.qxq = 12.0f;
        this.sf = context;
        this.wh = pccVar;
        this.fy = new HashMap();
        this.gr = new GradientDrawable();
        this.vj = pcc();
    }

    public T vh() {
        return this.vj;
    }

    public void sf(JSONObject jSONObject) {
        this.oo = jSONObject;
        hc();
    }

    public void pcc(JSONObject jSONObject) {
        this.oo = jSONObject;
        hc();
        JSONObject jSONObject2 = this.gm;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        pcc<ViewGroup> pccVar = this.wh;
        pcc.C0109pcc ork = pccVar instanceof pcc ? pccVar.ork() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(this.gm.optString(next), jSONObject);
            pcc(next, pcc);
            if (ork != null) {
                ork.pcc(this.sf, next, pcc);
            }
        }
        if (ork != null) {
            pcc(ork.pcc());
        }
        if (this.xfm == null || this.oo == null) {
            return;
        }
        try {
            if (lq()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("i18n", this.xfm);
                this.oo.put("xNode", jSONObject3);
                return;
            }
            this.oo.put("i18n", this.xfm);
        } catch (JSONException unused) {
        }
    }

    public JSONObject tmg() {
        return this.oo;
    }

    public void hc() {
        boolean optBoolean = this.oo.optBoolean("gesture_through_enable", false);
        qf.pcc pccVar = this.kj;
        boolean z = pccVar == null || pccVar.gm();
        this.ywc = optBoolean && z;
        Log.d("GesThrough_UGenWidget", "gesBySettings: " + optBoolean + ", gesByTemplate: " + z + ", mGestureThroughEnabled: " + this.ywc);
        this.cz = this.oo.optBoolean("is_adapt_two_finger", false);
    }

    public void sf() {
        tsz();
        gbb();
        gm(this.bg);
        gm();
        oo();
        vy vyVar = this.jy;
        if (vyVar != null) {
            vyVar.pcc();
            this.jy.sf();
            this.jy.gm();
        }
        this.vj.setOnTouchListener(this);
        ork();
        ViewGroup viewGroup = (ViewGroup) this.vj.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.gpa);
        }
        com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
        if (pccVar != null) {
            pccVar.oo();
        }
        wh whVar = this.gdh;
        if (whVar != null) {
            whVar.pcc();
        }
        vy vyVar2 = this.jy;
        if (vyVar2 != null) {
            vyVar2.oo();
        }
        if (this.fvk == null || !sf(22)) {
            return;
        }
        this.fvk.pcc(this.fy.get(22), this, this);
    }

    protected void gbb() {
        this.vj.setPadding((int) (this.zti ? this.tsz : this.jsj), (int) (this.mu ? this.atb : this.jsj), (int) (this.pq ? this.mk : this.jsj), (int) (this.nn ? this.ye : this.jsj));
    }

    private void gm() {
        if (this.pcc) {
            this.vj.setTranslationX(this.ei);
        }
        if (this.vd) {
            this.vj.setTranslationY(this.vgx);
        }
        if (this.xf) {
            this.vj.setScaleX(this.ra);
        }
        if (this.uae) {
            this.vj.setScaleY(this.rt);
        }
        if (this.gga) {
            this.vj.setRotation(this.qc);
        }
        if (this.rc) {
            this.vj.setRotationX(this.wax);
        }
        if (this.kez) {
            this.vj.setRotationY(-this.bbd);
        }
        if (this.ofe) {
            this.vj.setAlpha(this.jq);
        }
        float f = this.pv;
        if (f != 0.0f) {
            this.vj.setRotation(f);
        }
        if (this.gga || this.rc || this.kez) {
            this.vj.setCameraDistance(10000.0f);
        }
    }

    public float jr() {
        return this.ei;
    }

    public float dax() {
        return this.vgx;
    }

    public float nac() {
        return this.ra;
    }

    public float lu() {
        return this.rt;
    }

    public float gpj() {
        return this.wax;
    }

    public float lo() {
        return this.bbd;
    }

    public float fum() {
        return this.pv;
    }

    public float tz() {
        return this.jq;
    }

    public float of() {
        return this.xb;
    }

    @Deprecated
    private void oo() {
        com.bytedance.adsdk.ugeno.core.sf.oo oo;
        this.vj.setVisibility(this.bg);
        float f = this.pv;
        if (f != 0.0f) {
            this.vj.setRotation(f);
        }
        qf.pcc pccVar = this.kj;
        if (pccVar != null && TextUtils.isEmpty(pccVar.sf())) {
            this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.sf.gm.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (gm.this.gqd != null) {
                        boolean unused = gm.this.gye;
                    }
                }
            });
        } else if (sf(1) && !this.pzh) {
            this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.sf.gm.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    if (gm.this.fvk == null || !gm.this.gye) {
                        return;
                    }
                    jr jrVar = gm.this.fvk;
                    hc hcVar = gm.this.fy.get(1);
                    gm gmVar = gm.this;
                    jrVar.pcc(hcVar, gmVar, gmVar);
                }
            });
        }
        if (this.fvk != null && sf(4)) {
            if (sf(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + pq());
                this.gmh = true;
                this.by = new vj(this.sf, this.fy.get(4), this.fy.get(1), this.gmh, erj(), this.cz);
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + pq());
                this.by = new vj(this.sf, this.fy.get(4), this.gmh, erj(), this.cz);
            }
        }
        if (this.fvk != null && sf(1) && this.pzh) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.pzh + ", view.id: " + pq());
            this.xy = new com.bytedance.adsdk.ugeno.core.sf.gm(this.sf, this.fy.get(1));
        }
        vy();
        if (this.fvk != null && sf(3) && (oo = com.bytedance.adsdk.ugeno.vj.pcc().oo()) != null) {
            this.ln = oo.pcc(this.sf, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.sf.gm.3
            };
        }
        if (this.fvk != null && sf(9)) {
            com.bytedance.adsdk.ugeno.core.sf.wh whVar = new com.bytedance.adsdk.ugeno.core.sf.wh(this.sf, this.fy.get(9), this);
            this.zk = whVar;
            whVar.pcc(this.fvk);
        }
        if (sf(10)) {
            com.bytedance.adsdk.ugeno.core.sf.sf sfVar = new com.bytedance.adsdk.ugeno.core.sf.sf(this.sf, this.fy.get(10), this);
            this.rv = sfVar;
            sfVar.pcc(this.fvk);
        }
    }

    private void vy() {
        hc hcVar;
        if (this.fvk == null || !sf(18) || (hcVar = this.fy.get(18)) == null) {
            return;
        }
        JSONObject gm = hcVar.gm();
        if (gm != null) {
            try {
                gm.put("rotateZ", com.bytedance.adsdk.ugeno.gm.sf.pcc(gm.optString("rotateZ"), this.oo));
            } catch (JSONException unused) {
            }
        }
        this.fvk.pcc(hcVar, this, this);
    }

    private void ork() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vh);
        this.vj.setContentDescription(sb);
    }

    public void pcc(lu luVar) {
        this.lc = luVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void qf() {
        if (this.jmx != null) {
            ork orkVar = new ork(this.vj, this.jmx);
            this.eko = orkVar;
            orkVar.pcc();
        }
        com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
        if (pccVar != null) {
            pccVar.pcc();
        }
        wh whVar = this.gdh;
        if (whVar != null) {
            whVar.sf();
        }
        vy vyVar = this.jy;
        if (vyVar != null) {
            vyVar.vj();
        }
        if (this.rv != null && sf(10)) {
            this.rv.pcc();
        }
        if (this.zk != null && sf(9)) {
            this.zk.pcc();
        }
        vj vjVar = this.by;
        if (vjVar != null) {
            vjVar.pcc();
        }
        this.wjv = System.currentTimeMillis();
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void kj() {
        ork orkVar = this.eko;
        if (orkVar != null) {
            orkVar.sf();
        }
        com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
        if (pccVar != null) {
            pccVar.gm();
        }
        wh whVar = this.gdh;
        if (whVar != null) {
            whVar.gm();
        }
    }

    public jr yt() {
        return this.fvk;
    }

    public long qy() {
        return this.wjv;
    }

    public boolean sf(int i) {
        Map<Integer, hc> map = this.fy;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public void gm(int i) {
        ViewParent viewParent = (ViewGroup) this.vj.getParent();
        if (viewParent instanceof sf) {
            ((sf) viewParent).gm(this.vj, i);
        } else {
            this.vj.setVisibility(i);
        }
    }

    public void pcc(dax daxVar) {
        this.mua = daxVar;
    }

    public void pcc(jr jrVar) {
        this.fvk = jrVar;
    }

    public void gm(JSONObject jSONObject) {
        this.gm = jSONObject;
    }

    public JSONObject jsj() {
        return this.gm;
    }

    protected void tsz() {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        if (TextUtils.isEmpty(this.tsx)) {
            if (this.bxz) {
                pcc(this.kx);
                return;
            } else {
                this.gr.setColor(this.rnn);
                oo(this.rnn);
                return;
            }
        }
        if (this.tsx.startsWith("local://")) {
            String replace = this.tsx.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = this.lrr ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap decodeStream = BitmapFactory.decodeStream(this.sf.getResources().openRawResource(com.bytedance.adsdk.ugeno.qf.oo.sf(this.sf, replace)), null, options);
                if (this.lrr) {
                    Bitmap pcc = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, decodeStream, (int) this.rj);
                    if (pcc != null) {
                        bitmapDrawable2 = new BitmapDrawable(this.sf.getResources(), pcc);
                        pcc(bitmapDrawable2);
                        return;
                    }
                    bitmapDrawable = new BitmapDrawable(this.sf.getResources(), decodeStream);
                } else {
                    bitmapDrawable = new BitmapDrawable(this.sf.getResources(), decodeStream);
                }
                bitmapDrawable2 = bitmapDrawable;
                pcc(bitmapDrawable2);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        mk();
    }

    protected void mk() {
        com.bytedance.adsdk.ugeno.vj.pcc().sf().pcc(this.vy, this.tsx, new pcc.InterfaceC0106pcc() { // from class: com.bytedance.adsdk.ugeno.sf.gm.4
            @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
            public void pcc(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                if (gm.this.lrr) {
                    final Bitmap pcc = com.bytedance.adsdk.ugeno.qf.kj.pcc(gm.this.sf, bitmap, (int) gm.this.rj);
                    if (pcc != null) {
                        com.bytedance.adsdk.ugeno.qf.kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.sf.gm.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                gm.this.pcc(new BitmapDrawable(pcc));
                            }
                        });
                        return;
                    }
                    return;
                }
                com.bytedance.adsdk.ugeno.qf.kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.sf.gm.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.pcc(new BitmapDrawable(bitmap));
                    }
                });
            }
        });
    }

    protected void pcc(pcc.C0108pcc c0108pcc) {
        if (c0108pcc == null) {
            return;
        }
        this.gr.setShape(0);
        if (c0108pcc != null) {
            this.gr.setOrientation(c0108pcc.pcc);
            if (Build.VERSION.SDK_INT >= 29) {
                this.gr.setColors(c0108pcc.sf, c0108pcc.gm);
            } else {
                this.gr.setColors(c0108pcc.sf);
            }
        }
        ptr();
        se();
        this.vj.setBackground(this.gr);
    }

    protected void oo(int i) {
        this.gr.setShape(0);
        this.gr.setColor(i);
        ptr();
        se();
        this.vj.setBackground(this.gr);
    }

    private void se() {
        if (TextUtils.equals("dashed", this.vr)) {
            GradientDrawable gradientDrawable = this.gr;
            float f = this.hoh;
            gradientDrawable.setStroke((int) f, this.qcw, 3.0f * f, f);
        } else {
            if (TextUtils.equals("dotted", this.vr)) {
                GradientDrawable gradientDrawable2 = this.gr;
                float f2 = this.hoh;
                gradientDrawable2.setStroke((int) f2, this.qcw, f2 / 2.0f, f2);
                return;
            }
            this.gr.setStroke((int) this.hoh, this.qcw);
        }
    }

    private void ptr() {
        float f = this.gd ? this.ri : this.xb;
        float f2 = this.erj ? this.fmh : this.xb;
        float f3 = this.se ? this.hpk : this.xb;
        float f4 = this.ptr ? this.zsj : this.xb;
        this.gr.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    protected void pcc(Drawable drawable) {
        this.vj.setBackground(drawable);
    }

    public void pcc(ViewGroup.LayoutParams layoutParams) {
        T t = this.vj;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.tmh = layoutParams;
    }

    public ViewGroup.LayoutParams atb() {
        return this.tmh;
    }

    public void pcc(boolean z, boolean z2) {
        if (this.vj != null) {
            pcc(this.tmh);
            if (z) {
                vj((int) this.hc);
            }
            if (z2) {
                wh((int) this.gbb);
            }
        }
    }

    public void pcc(qf.pcc pccVar) {
        this.kj = pccVar;
    }

    public qf.pcc ye() {
        return this.kj;
    }

    public gm<T> vj(String str) {
        return pcc(str);
    }

    protected gm<T> pcc(String str) {
        if (TextUtils.isEmpty(this.vh) || !TextUtils.equals(this.vh, str)) {
            return null;
        }
        return this;
    }

    public gm<T> wh(String str) {
        return sf(str);
    }

    protected gm<T> sf(String str) {
        if (TextUtils.isEmpty(this.tmg) || !TextUtils.equals(this.tmg, str)) {
            return null;
        }
        return this;
    }

    public gm<T> qf(String str) {
        return gm(str);
    }

    protected gm<T> gm(String str) {
        if (!TextUtils.isEmpty(this.tmg) && TextUtils.equals(this.tmg, str) && this.bg == 0) {
            return this;
        }
        return null;
    }

    public gm<T> kj(String str) {
        return oo(str);
    }

    protected gm<T> oo(String str) {
        if (tmg(str) != null) {
            return this;
        }
        return null;
    }

    public void pcc(boolean z) {
        this.ork = z;
    }

    public boolean lq() {
        return this.ork;
    }

    public pcc zti() {
        return this.wh;
    }

    public void pcc(pcc pccVar) {
        this.wh = pccVar;
    }

    public void vy(String str) {
        this.vh = str;
    }

    public String pq() {
        return this.vh;
    }

    public void ork(String str) {
        this.tmg = str;
    }

    public String mu() {
        return this.tmg;
    }

    public int nn() {
        return (int) this.hc;
    }

    public int rnn() {
        return (int) this.gbb;
    }

    public void pcc(vh vhVar) {
        this.vy = vhVar;
    }

    public boolean tsx() {
        return this.ew;
    }

    public void pcc(kj kjVar) {
        this.gqd = kjVar;
    }

    public int kun() {
        return this.rnn;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c = 0;
                    break;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    c = 1;
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 2;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 3;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 4;
                    break;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    c = 5;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c = 6;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c = 7;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c = '\b';
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c = '\t';
                    break;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    c = '\n';
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c = 11;
                    break;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    c = '\f';
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = '\r';
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c = 14;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = 15;
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c = 16;
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c = 17;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c = 18;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c = 19;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c = 20;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 21;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 22;
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = 23;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c = 24;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c = 25;
                    break;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    c = 26;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 27;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c = 28;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 29;
                    break;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    c = 30;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 31;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = ' ';
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c = '!';
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c = '\"';
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = '#';
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = Typography.dollar;
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = '%';
                    break;
                }
                break;
            case 314070383:
                if (str.equals("animations")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c = '\'';
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c = '(';
                    break;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c = ')';
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c = GMTDateParser.ANY;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c = '+';
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = '-';
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c = '.';
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = FileSystemKt.UnixPathSeparator;
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c = '0';
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = '1';
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = '2';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c = '3';
                    break;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    c = '4';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c = '5';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c = '6';
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = '7';
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c = '8';
                    break;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    c = '9';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c = ';';
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c = Typography.less;
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c = C4761z5.U;
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c = Typography.greater;
                    break;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    c = '?';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c = '@';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY)) {
                    c = 'A';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = 'B';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c = 'C';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.gye = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 18:
            case '!':
            case '\'':
            case '0':
            case '3':
            case '6':
            case '>':
            case '@':
                sf(str, str2);
                break;
            case 2:
                this.pcc = true;
                this.ei = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case 3:
                this.vd = true;
                this.vgx = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case 4:
                this.tsz = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.zti = true;
                break;
            case 5:
                this.lo = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case 11:
            case '7':
                if (com.bytedance.adsdk.ugeno.qf.pcc.gm(str2)) {
                    this.bxz = true;
                    this.kx = com.bytedance.adsdk.ugeno.qf.pcc.sf(str2);
                    break;
                } else {
                    this.rnn = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2, 0);
                    this.bxz = false;
                    break;
                }
            case '\f':
                this.jy = vy.pcc(this, str2);
                break;
            case '\r':
                this.ofe = true;
                this.jq = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case 14:
                this.ri = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.gd = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.gbb = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.gbb = -2.0f;
                } else {
                    this.gbb = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                }
                this.hl = true;
                break;
            case 16:
                this.jr = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                break;
            case 17:
                this.lu = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.yt = true;
                break;
            case 19:
            case '8':
                this.tsx = str2;
                break;
            case 20:
                this.gga = true;
                this.qc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case 21:
                this.xf = true;
                this.ra = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case 22:
                this.uae = true;
                this.rt = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case 23:
                this.jsj = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.lq = true;
                break;
            case 24:
                this.oyx = str2;
                break;
            case 25:
                this.gpj = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.qy = true;
                break;
            case 26:
                this.fum = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case 27:
                this.vh = str2;
                break;
            case 28:
                this.xfm = com.bytedance.adsdk.ugeno.qf.sf.pcc(str2, (JSONObject) null);
                break;
            case 29:
                this.tmg = str2;
                break;
            case 30:
                float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                this.rj = pcc;
                if (pcc > 0.0f) {
                    this.lrr = true;
                    break;
                }
                break;
            case 31:
                this.atb = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.mu = true;
                break;
            case ' ':
                this.zpi = str2;
                break;
            case '\"':
                this.kz = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case '#':
                this.xf = true;
                this.uae = true;
                float[] sf = com.bytedance.adsdk.ugeno.pcc.oo.sf(str2, this.oo);
                this.ra = sf[0];
                this.rt = sf[1];
                break;
            case '$':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.hc = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.hc = -2.0f;
                } else {
                    this.hc = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                }
                this.dt = true;
                break;
            case '%':
                this.ye = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.nn = true;
                break;
            case '&':
                List<com.bytedance.adsdk.ugeno.pcc.gm> pcc2 = com.bytedance.adsdk.ugeno.pcc.oo.pcc(str2, this.oo);
                if (pcc2 != null && !pcc2.isEmpty()) {
                    this.gdh = new wh(this.sf, this, pcc2);
                    break;
                }
                break;
            case '(':
                this.fmh = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.erj = true;
                break;
            case ')':
                this.gpa = gbb(str2);
                break;
            case '*':
                this.hpk = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.se = true;
                break;
            case '+':
                this.zsj = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.ptr = true;
                break;
            case ',':
                this.mk = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.pq = true;
                break;
            case '-':
                this.qcw = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case '.':
                this.vr = str2;
                break;
            case '/':
                this.hoh = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                break;
            case '1':
                this.nac = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.of = true;
                break;
            case '2':
                this.pcc = true;
                this.vd = true;
                float[] sf2 = com.bytedance.adsdk.ugeno.pcc.oo.sf(str2, this.oo);
                this.ei = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, sf2[0]);
                this.vgx = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, sf2[1]);
                break;
            case '4':
                try {
                    this.gh = new com.bytedance.adsdk.ugeno.pcc.pcc(this.sf, this, com.bytedance.adsdk.ugeno.pcc.oo.pcc(new JSONObject(str2), this.oo));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            case '5':
                this.jmx = com.bytedance.adsdk.ugeno.core.pcc.pcc(str2, this);
                break;
            case '9':
                this.iv = true;
                this.kun = hc(str2);
                break;
            case ':':
                this.xb = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                break;
            case ';':
                this.rc = true;
                this.wax = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case '<':
                this.kez = true;
                this.bbd = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case '=':
                this.pv = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case '?':
                this.az = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case 'A':
                if (TextUtils.equals("visible", str2)) {
                    this.bg = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.bg = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.bg = 8;
                }
                this.vj.setVisibility(this.bg);
                break;
            case 'B':
                this.dax = com.bytedance.adsdk.ugeno.qf.kj.pcc(this.sf, str2);
                this.tz = true;
                break;
            case 'C':
                this.ew = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    private ImageView.ScaleType hc(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.kun = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.kun = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.kun = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.kun = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.kun;
    }

    private boolean gbb(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    protected void sf(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.fy == null) {
            return;
        }
        try {
            int pcc = com.bytedance.adsdk.ugeno.core.gbb.pcc(str).pcc();
            hc hcVar = new hc();
            hcVar.pcc(pcc);
            hcVar.pcc(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (pcc == 3) {
                try {
                    this.qxq = Float.parseFloat(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("shakeAmplitude"), this.oo));
                } catch (NumberFormatException unused) {
                    this.qxq = 12.0f;
                }
            }
            if (!(this.fvk instanceof com.bytedance.adsdk.ugeno.core.pcc.sf)) {
                pcc(pcc, jSONObject, hcVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    @Deprecated
    protected void pcc(int i, JSONObject jSONObject, hc hcVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("success");
        if (optJSONObject != null) {
            hc hcVar2 = new hc();
            hcVar2.pcc(optJSONObject);
            hcVar2.pcc(this);
            hcVar.pcc(hcVar2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(U3.g.e);
        if (optJSONObject2 != null) {
            hc hcVar3 = new hc();
            hcVar3.pcc(optJSONObject2);
            hcVar3.pcc(this);
            hcVar.sf(hcVar3);
        }
        hcVar.pcc(jSONObject);
        this.fy.put(Integer.valueOf(i), hcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void vj() {
        if (this.lc == null || this.bgf) {
            return;
        }
        this.bgf = true;
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void wh() {
        if (this.lc == null || this.esn) {
            return;
        }
        this.esn = true;
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public int[] pcc(int i, int i2) {
        if (this.kz > 0.0f) {
            if (this.dt) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.kz;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.hl) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.kz;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.lc != null && !this.dp) {
            this.dp = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void pcc(int i, int i2, int i3, int i4) {
        if (this.lc == null || this.bq) {
            return;
        }
        this.bq = true;
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void pcc(Canvas canvas, IAnimation iAnimation) {
        ork orkVar = this.eko;
        if (orkVar != null) {
            orkVar.pcc(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void pcc(Canvas canvas) {
        if (this instanceof pcc) {
            return;
        }
        com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
        if (pccVar != null) {
            pccVar.pcc(canvas);
        }
        wh whVar = this.gdh;
        if (whVar != null) {
            whVar.pcc(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void sf(Canvas canvas) {
        if (this instanceof pcc) {
            com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
            if (pccVar != null) {
                pccVar.sf(canvas);
            }
            wh whVar = this.gdh;
            if (whVar != null) {
                whVar.sf(canvas);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oo
    public void sf(int i, int i2, int i3, int i4) {
        ork orkVar = this.eko;
        if (orkVar != null) {
            orkVar.pcc(i, i2);
        }
        com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
        if (pccVar != null) {
            pccVar.pcc(i, i2);
        }
        wh whVar = this.gdh;
        if (whVar != null) {
            whVar.pcc(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.jr.sf
    public void pcc(hc hcVar) {
        pcc<ViewGroup> pccVar;
        gm<T> vj;
        if (hcVar == null || hcVar.gm() == null || !TextUtils.equals(hcVar.gm().optString("type"), "onDismiss")) {
            return;
        }
        String optString = hcVar.gm().optString("nodeId");
        gm(8);
        this.qf = (pcc) sf(this);
        if (TextUtils.isEmpty(optString) || (pccVar = this.qf) == null || (vj = pccVar.vj(optString)) == null) {
            return;
        }
        vj.gm(8);
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo.pcc.pcc pccVar) {
        this.ct = pccVar;
    }

    public com.bytedance.adsdk.ugeno.oo.pcc.pcc rj() {
        return this.ct;
    }

    public gm sf(gm gmVar) {
        return (gmVar.zti() == null && (gmVar instanceof pcc)) ? gmVar : sf(gmVar.zti());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        vj vjVar;
        jr jrVar;
        com.bytedance.adsdk.ugeno.core.sf.gm gmVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            lrr();
        } else if (action == 1 || action == 3) {
            iv();
        }
        dax daxVar = this.mua;
        if (daxVar != null) {
            daxVar.pcc(this, motionEvent);
        }
        if (sf(17) && motionEvent.getAction() == 0) {
            this.fvk.pcc(this.fy.get(17), this, this);
        }
        if (sf(1) && this.pzh && (jrVar = this.fvk) != null && (gmVar = this.xy) != null) {
            return gmVar.pcc(jrVar, this, motionEvent);
        }
        jr jrVar2 = this.fvk;
        if (jrVar2 != null && (vjVar = this.by) != null) {
            return vjVar.pcc(jrVar2, this, motionEvent, erj());
        }
        vy vyVar = this.jy;
        if (vyVar != null) {
            return vyVar.pcc(motionEvent);
        }
        return false;
    }

    public boolean xb() {
        return this.kz > 0.0f;
    }

    public float ri() {
        T t = this.vj;
        if (t instanceof com.bytedance.adsdk.ugeno.pcc.qf) {
            return ((com.bytedance.adsdk.ugeno.pcc.qf) t).getRipple();
        }
        return 0.0f;
    }

    public float hpk() {
        T t = this.vj;
        if (t instanceof com.bytedance.adsdk.ugeno.pcc.qf) {
            return ((com.bytedance.adsdk.ugeno.pcc.qf) t).getShine();
        }
        return 0.0f;
    }

    public float fmh() {
        T t = this.vj;
        if (t instanceof com.bytedance.adsdk.ugeno.pcc.qf) {
            return ((com.bytedance.adsdk.ugeno.pcc.qf) t).getStretch();
        }
        return 0.0f;
    }

    public float zsj() {
        T t = this.vj;
        if (t instanceof com.bytedance.adsdk.ugeno.pcc.qf) {
            return ((com.bytedance.adsdk.ugeno.pcc.qf) t).getRubIn();
        }
        return 0.0f;
    }

    public void vj(int i) {
        if (lq()) {
            T t = this.vj;
            if (t instanceof sf) {
                ((sf) t).pcc(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof sf) {
                ((sf) viewParent).pcc(this.vj, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.vj.getLayoutParams();
        layoutParams.width = i;
        this.vj.setLayoutParams(layoutParams);
    }

    public void wh(int i) {
        if (lq()) {
            T t = this.vj;
            if (t instanceof sf) {
                ((sf) t).sf(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof sf) {
                ((sf) viewParent).sf(this.vj, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.vj.getLayoutParams();
        layoutParams.height = i;
        this.vj.setLayoutParams(layoutParams);
    }

    public boolean gd() {
        return this.az;
    }

    public List<com.bytedance.adsdk.ugeno.oo.oo.gm> vh(String str) {
        vy vyVar;
        if (TextUtils.isEmpty(str) || (vyVar = this.jy) == null) {
            return null;
        }
        return vyVar.pcc(str);
    }

    public void pcc(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.oo.oo.gm> vh = vh(str);
        if (vh == null || vh.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.oo.oo.gm gmVar : vh) {
            gmVar.pcc(this.jy);
            gmVar.pcc(objArr);
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.core.vj vjVar) {
        vy vyVar = this.jy;
        if (vyVar != null) {
            vyVar.pcc(vjVar);
        }
    }

    public com.bytedance.adsdk.ugeno.pcc.pcc tmg(String str) {
        com.bytedance.adsdk.ugeno.pcc.pcc pccVar = this.gh;
        if (pccVar != null && TextUtils.equals(str, pccVar.vj())) {
            return this.gh;
        }
        wh whVar = this.gdh;
        if (whVar != null) {
            return whVar.pcc(str);
        }
        return null;
    }

    public void pcc(com.bytedance.adsdk.ugeno.core.wh whVar) {
        this.vo = whVar;
    }

    public boolean erj() {
        return this.ywc;
    }

    public void pcc(gbb gbbVar) {
        vy vyVar = this.jy;
        if (vyVar != null) {
            vyVar.pcc(gbbVar);
        }
        this.oa = gbbVar;
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo.hc hcVar) {
        vy vyVar = this.jy;
        if (vyVar != null) {
            vyVar.pcc(hcVar);
        }
        this.luz = hcVar;
    }
}
