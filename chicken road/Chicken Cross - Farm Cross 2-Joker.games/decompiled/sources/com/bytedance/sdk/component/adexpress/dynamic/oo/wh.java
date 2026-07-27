package com.bytedance.sdk.component.adexpress.dynamic.oo;

import androidx.compose.material.MenuKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh {
    private double atb;
    private int az;
    private List<pcc> bbd;
    private int bg;
    private String bgf;
    private int bxz;
    private boolean by;
    private String dax;
    private String dp;
    private int ei;
    private int eko;
    private boolean erj;
    private int ew;
    private boolean fmh;
    private String fum;
    private int fvk;
    private boolean fy;
    private String gbb;
    private String gd;
    private int gdh;
    private String gga;
    private int gh;
    private float gm;
    private String gmh;
    private int gpa;
    private String gpj;
    private int gqd;
    private int gr;
    private String hc;
    private boolean hoh;
    private int hpk;
    private double iv;
    private String jmx;
    private int jq;
    private String jr;
    private int jsj;
    private double jy;
    private JSONObject kez;
    private float kj;
    private int kun;
    private boolean kx;
    private boolean kz;
    private long lc = -1;
    private int ln;
    private String lo;
    private String lq;
    private int lrr;
    private String lu;
    private double mk;
    private String mu;
    private boolean mua;
    private String nac;
    private boolean nn;
    private String of;
    private int ofe;
    private float oo;
    private float ork;
    private int otd;
    private int oyx;
    private float pcc;
    private String pq;
    private boolean ptr;
    private int pv;
    private String pzh;
    private int qc;
    private String qcw;
    private float qf;
    private boolean qy;
    private boolean ra;
    private boolean rc;
    private boolean ri;
    private int rj;
    private int rnn;
    private int rt;
    private boolean rv;
    private boolean se;
    private float sf;
    private double tmg;
    private int tmh;
    private int tsx;
    private int tsz;
    private String tz;
    private int uae;
    private JSONObject vd;
    private String vgx;
    private double vh;
    private boolean vj;
    private boolean vo;
    private JSONObject vr;
    private float vy;
    private int wax;
    private float wh;
    private int xb;
    private JSONObject xf;
    private String xy;
    private String ye;
    private String yt;
    private String ywp;
    private int zk;
    private int zpi;
    private int zsj;
    private String zti;

    public static wh pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        wh whVar = new wh();
        whVar.sf(jSONObject.optString("adType", "embeded"));
        whVar.jr(jSONObject.optString("clickArea", "creative"));
        whVar.dax(jSONObject.optString("clickTigger", "click"));
        whVar.gm(jSONObject.optString("fontFamily", "PingFangSC"));
        whVar.oo(jSONObject.optString("textAlign", "left"));
        whVar.vj(jSONObject.optString("color", "#999999"));
        whVar.wh(jSONObject.optString("bgColor", U3.i.T));
        whVar.qf(jSONObject.optString("bgImgUrl", ""));
        whVar.tsz(jSONObject.optString("bgImgData", ""));
        whVar.kj(jSONObject.optString("borderColor", "#000000"));
        whVar.vy(jSONObject.optString("borderStyle", "solid"));
        whVar.ork(jSONObject.optString("heightMode", "auto"));
        whVar.vh(jSONObject.optString("widthMode", "fixed"));
        whVar.tmg(jSONObject.optString("interactText", ""));
        whVar.gm(jSONObject.optBoolean("isShowBgControl", false));
        whVar.hc(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            whVar.qf(optJSONObject.optInt("translateY", 0));
            whVar.kj(optJSONObject.optInt("translateX", 0));
            whVar.oo(optJSONObject.optDouble("scaleX", 0.0d));
            whVar.vj(optJSONObject.optDouble("scaleY", 0.0d));
        }
        whVar.gbb(jSONObject.optString("interactType", ""));
        whVar.vj(jSONObject.optInt("interactSlideDirection", -1));
        whVar.nac(jSONObject.optString("justifyHorizontal", "space-around"));
        whVar.lu(jSONObject.optString("justifyVertical", "flex-start"));
        whVar.sf(jSONObject.optDouble("timingStart"));
        whVar.gm(jSONObject.optDouble("timingEnd"));
        whVar.oo((float) jSONObject.optDouble("width", 0.0d));
        whVar.gm((float) jSONObject.optDouble("height", 0.0d));
        whVar.pcc((float) jSONObject.optDouble("borderRadius", 0.0d));
        whVar.sf((float) jSONObject.optDouble("borderSize", 0.0d));
        whVar.sf(jSONObject.optBoolean("interactValidate", false));
        whVar.vy((float) jSONObject.optDouble("fontSize", 0.0d));
        whVar.vj((float) jSONObject.optDouble("paddingBottom", 0.0d));
        whVar.wh((float) jSONObject.optDouble("paddingLeft", 0.0d));
        whVar.qf((float) jSONObject.optDouble("paddingRight", 0.0d));
        whVar.kj((float) jSONObject.optDouble("paddingTop", 0.0d));
        whVar.oo(jSONObject.optBoolean("lineFeed", false));
        whVar.vy(jSONObject.optInt("lineCount", 0));
        whVar.wh(jSONObject.optDouble("lineHeight", 1.2d));
        whVar.gbb(jSONObject.optInt("letterSpacing", 0));
        whVar.vj(jSONObject.optBoolean("isDataFixed", false));
        whVar.jr(jSONObject.optInt("fontWeight"));
        whVar.wh(jSONObject.optBoolean("lineLimit"));
        whVar.dax(jSONObject.optInt(U3.i.L));
        whVar.gpj(jSONObject.optString("align"));
        whVar.qf(jSONObject.optBoolean("useLeft"));
        whVar.kj(jSONObject.optBoolean("useRight"));
        whVar.vy(jSONObject.optBoolean("useTop"));
        whVar.ork(jSONObject.optBoolean("useBottom"));
        whVar.lo(jSONObject.optString("data"));
        whVar.sf(jSONObject.optJSONObject("i18n"));
        whVar.tmg(jSONObject.optInt("marginLeft"));
        whVar.hc(jSONObject.optInt("marginRight"));
        whVar.ork(jSONObject.optInt("marginTop"));
        whVar.vh(jSONObject.optInt("marginBottom"));
        whVar.nac(jSONObject.optInt("tagMaxCount"));
        whVar.vh(jSONObject.optBoolean("allowTextFlow"));
        whVar.lu(jSONObject.optInt("textFlowType"));
        whVar.gpj(jSONObject.optInt("textFlowDuration"));
        whVar.lo(jSONObject.optInt("left"));
        whVar.fum(jSONObject.optInt("right"));
        whVar.tz(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY));
        whVar.of(jSONObject.optInt("bottom"));
        whVar.fum(jSONObject.optString("alignItems", "flex-start"));
        whVar.tz(jSONObject.optString("direction", ""));
        whVar.pcc(jSONObject.optBoolean("loop", false));
        whVar.yt(jSONObject.optInt("zIndex"));
        whVar.atb(jSONObject.optInt("interactVisibleTime"));
        whVar.qy(jSONObject.optInt("interactHiddenTime"));
        whVar.hc(jSONObject.optBoolean("interactEnableMask"));
        whVar.gbb(jSONObject.optBoolean("interactWontHide"));
        whVar.pcc(jSONObject.optString("bgGradient"));
        whVar.lq(jSONObject.optInt("areaType"));
        whVar.zti(jSONObject.optInt("interactSlideThreshold", 0));
        whVar.nn(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.oo.sf() ? 0 : MenuKt.InTransitionDuration));
        whVar.lu(jSONObject.optBoolean("openPlayableLandingPage", false));
        whVar.gm(jSONObject.optJSONObject("video"));
        whVar.oo(jSONObject.optJSONObject("image"));
        whVar.pq(jSONObject.optInt("borderShadowExtent"));
        whVar.jr(jSONObject.optBoolean("bgGauseBlur"));
        whVar.mu(jSONObject.optInt("bgGauseBlurRadius"));
        whVar.dax(jSONObject.optBoolean("showTimeProgress", false));
        whVar.nac(jSONObject.optBoolean("showPlayButton", false));
        whVar.pcc(jSONObject.optDouble("bgColorCg", 0.0d));
        whVar.wh(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        whVar.sf(jSONObject.optInt("borderTopLeftRadius", 0));
        whVar.pcc(jSONObject.optInt("borderTopRightRadius", 0));
        whVar.oo(jSONObject.optInt("borderBottomLeftRadius", 0));
        whVar.gm(jSONObject.optInt("borderBottomRightRadius", 0));
        whVar.vj(jSONObject.optJSONObject("interactI18n"));
        whVar.yt(jSONObject.optString("imageObjectFit"));
        whVar.qy(jSONObject.optString("interactTitle"));
        whVar.ye(jSONObject.optInt("interactTextPositionTop"));
        whVar.of(jSONObject.optString("imageLottieTosPath"));
        whVar.tmg(jSONObject.optBoolean("animationsLoop"));
        whVar.jsj(jSONObject.optInt("lottieAppNameMaxLength"));
        whVar.mk(jSONObject.optInt("lottieAdDescMaxLength"));
        whVar.tsz(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    pcc pccVar = new pcc();
                    pccVar.gm(jSONObject2.optString("animationType"));
                    pccVar.pcc(jSONObject2.optDouble("animationDuration"));
                    pccVar.sf(jSONObject2.optDouble("animationScaleX"));
                    pccVar.gm(jSONObject2.optDouble("animationScaleY"));
                    pccVar.oo(jSONObject2.optString("animationTimeFunction"));
                    pccVar.oo(jSONObject2.optDouble("animationDelay"));
                    pccVar.wh(jSONObject2.optInt("animationIterationCount"));
                    pccVar.vj(jSONObject2.optString("animationDirection"));
                    pccVar.vj(jSONObject2.optDouble("animationInterval"));
                    pccVar.pcc(jSONObject2.optInt("animationBorderWidth"));
                    pccVar.pcc(jSONObject2.optLong("key"));
                    pccVar.sf(jSONObject2.optInt("animationEffectWidth"));
                    pccVar.gm(jSONObject2.optInt("animationSwing", 1));
                    pccVar.oo(jSONObject2.optInt("animationTranslateX"));
                    pccVar.vj(jSONObject2.optInt("animationTranslateY"));
                    pccVar.sf(jSONObject2.optString("animationRippleBackgroundColor"));
                    pccVar.pcc(jSONObject2.optString("animationScaleDirection"));
                    pccVar.qf(jSONObject2.optInt("animationFadeStart"));
                    pccVar.kj(jSONObject2.optInt("animationFadeEnd"));
                    pccVar.wh(jSONObject2.optString("animationFillMode"));
                    pccVar.vy(jSONObject2.optInt("animationBounceHeight"));
                    if (whVar.gpj() > 0.0d) {
                        pccVar.oo(pccVar.gbb() + whVar.gpj());
                    }
                    arrayList.add(pccVar);
                }
                whVar.pcc(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                whVar.jsj(jSONObject.optString("triggerSlideDirection", "0"));
                whVar.pcc(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return whVar;
    }

    public boolean pcc() {
        return this.ra;
    }

    public void pcc(boolean z) {
        this.ra = z;
    }

    public int sf() {
        return this.gpa;
    }

    public void pcc(int i) {
        this.gpa = i;
    }

    public int gm() {
        return this.az;
    }

    public void sf(int i) {
        this.az = i;
    }

    public int oo() {
        return this.gr;
    }

    public void gm(int i) {
        this.gr = i;
    }

    public int vj() {
        return this.zpi;
    }

    public void oo(int i) {
        this.zpi = i;
    }

    public JSONObject wh() {
        return this.kez;
    }

    public int qf() {
        return this.uae;
    }

    public void vj(int i) {
        this.uae = i;
    }

    public double kj() {
        return this.jy;
    }

    public void pcc(double d) {
        this.jy = d;
    }

    public int vy() {
        return this.ofe;
    }

    public void wh(int i) {
        this.ofe = i;
    }

    public String ork() {
        return this.dp;
    }

    public void pcc(String str) {
        this.dp = str;
    }

    public float vh() {
        return this.pcc;
    }

    public void pcc(float f) {
        this.pcc = f;
    }

    public float tmg() {
        return this.sf;
    }

    public void sf(float f) {
        this.sf = f;
    }

    public void gm(float f) {
        this.gm = f;
    }

    public void oo(float f) {
        this.oo = f;
    }

    public boolean hc() {
        return this.vj;
    }

    public void sf(boolean z) {
        this.vj = z;
    }

    public float gbb() {
        return this.wh;
    }

    public void vj(float f) {
        this.wh = f;
    }

    public float jr() {
        return this.qf;
    }

    public void wh(float f) {
        this.qf = f;
    }

    public float dax() {
        return this.kj;
    }

    public void qf(float f) {
        this.kj = f;
    }

    public float nac() {
        return this.vy;
    }

    public void kj(float f) {
        this.vy = f;
    }

    public float lu() {
        return this.ork;
    }

    public void vy(float f) {
        this.ork = f;
    }

    public double gpj() {
        return this.vh;
    }

    public void sf(double d) {
        this.vh = d;
    }

    public double lo() {
        return this.tmg;
    }

    public void gm(double d) {
        this.tmg = d;
    }

    public void sf(String str) {
        this.hc = str;
    }

    public void gm(String str) {
        this.gbb = str;
    }

    public String fum() {
        return this.jr;
    }

    public void oo(String str) {
        this.jr = str;
    }

    public String tz() {
        return this.dax;
    }

    public void vj(String str) {
        this.dax = str;
    }

    public String of() {
        return this.nac;
    }

    public void wh(String str) {
        this.nac = str;
    }

    public void qf(String str) {
        this.lu = str;
    }

    public String yt() {
        return this.lu;
    }

    private void tsz(String str) {
        this.bgf = str;
    }

    public String qy() {
        return this.bgf;
    }

    public String jsj() {
        return this.gpj;
    }

    public void kj(String str) {
        this.gpj = str;
    }

    public void vy(String str) {
        this.lo = str;
    }

    public String tsz() {
        return this.fum;
    }

    public void ork(String str) {
        this.fum = str;
    }

    public String mk() {
        return this.tz;
    }

    public void vh(String str) {
        this.tz = str;
    }

    public String atb() {
        return this.of;
    }

    public void tmg(String str) {
        this.of = str;
    }

    public String ye() {
        return this.yt;
    }

    public void hc(String str) {
        this.yt = str;
    }

    public boolean lq() {
        return this.qy;
    }

    public void gm(boolean z) {
        this.qy = z;
    }

    public int zti() {
        return this.jsj;
    }

    public void qf(int i) {
        this.jsj = i;
    }

    public int pq() {
        return this.tsz;
    }

    public void kj(int i) {
        this.tsz = i;
    }

    public double mu() {
        return this.mk;
    }

    public void oo(double d) {
        this.mk = d;
    }

    public double nn() {
        return this.atb;
    }

    public void vj(double d) {
        this.atb = d;
    }

    public String rnn() {
        return this.ye;
    }

    public void gbb(String str) {
        this.ye = str;
    }

    public String tsx() {
        return this.lq;
    }

    public void jr(String str) {
        this.lq = str;
    }

    public String kun() {
        return this.zti;
    }

    public void dax(String str) {
        this.zti = str;
    }

    public String rj() {
        return this.pq;
    }

    public void nac(String str) {
        this.pq = str;
    }

    public String lrr() {
        return this.mu;
    }

    public void lu(String str) {
        this.mu = str;
    }

    public boolean iv() {
        return this.nn;
    }

    public void oo(boolean z) {
        this.nn = z;
    }

    public void vy(int i) {
        this.rnn = i;
    }

    public int xb() {
        return this.rnn;
    }

    public int ri() {
        return this.tsx;
    }

    public void ork(int i) {
        this.tsx = i;
    }

    public int hpk() {
        return this.kun;
    }

    public void vh(int i) {
        this.kun = i;
    }

    public int fmh() {
        return this.rj;
    }

    public void tmg(int i) {
        this.rj = i;
    }

    public int zsj() {
        return this.lrr;
    }

    public void hc(int i) {
        this.lrr = i;
    }

    public double gd() {
        return this.iv;
    }

    public void wh(double d) {
        this.iv = d;
    }

    public int erj() {
        return this.xb;
    }

    public void gbb(int i) {
        this.xb = i;
    }

    public boolean se() {
        return this.ri;
    }

    public void vj(boolean z) {
        this.ri = z;
    }

    public int ptr() {
        return this.hpk;
    }

    public void jr(int i) {
        this.hpk = i;
    }

    public boolean hoh() {
        return this.fmh;
    }

    public void wh(boolean z) {
        this.fmh = z;
    }

    public int qcw() {
        return this.zsj;
    }

    public void dax(int i) {
        this.zsj = i;
    }

    public String vr() {
        return this.gd;
    }

    public void gpj(String str) {
        this.gd = str;
    }

    public boolean bg() {
        return this.erj;
    }

    public void qf(boolean z) {
        this.erj = z;
    }

    public boolean kz() {
        return this.se;
    }

    public void kj(boolean z) {
        this.se = z;
    }

    public boolean ew() {
        return this.ptr;
    }

    public void vy(boolean z) {
        this.ptr = z;
    }

    public boolean tmh() {
        return this.hoh;
    }

    public void ork(boolean z) {
        this.hoh = z;
    }

    public String gh() {
        return this.qcw;
    }

    public void lo(String str) {
        this.qcw = str;
    }

    public void sf(JSONObject jSONObject) {
        this.vr = jSONObject;
    }

    public JSONObject gdh() {
        return this.vr;
    }

    public int otd() {
        return this.bg;
    }

    public void nac(int i) {
        this.bg = i;
    }

    public boolean ei() {
        return this.kz;
    }

    public void vh(boolean z) {
        this.kz = z;
    }

    public int vgx() {
        return this.ew;
    }

    public void lu(int i) {
        this.ew = i;
    }

    public int ywp() {
        return this.tmh;
    }

    public void gpj(int i) {
        this.tmh = i;
    }

    public int ra() {
        return this.gh;
    }

    public void lo(int i) {
        this.gh = i;
    }

    public int rt() {
        return this.gdh;
    }

    public void fum(int i) {
        this.gdh = i;
    }

    public int qc() {
        return this.otd;
    }

    public void tz(int i) {
        this.otd = i;
    }

    public int wax() {
        return this.ei;
    }

    public void of(int i) {
        this.ei = i;
    }

    public String bbd() {
        return this.vgx;
    }

    public void fum(String str) {
        this.vgx = str;
    }

    public String pv() {
        return this.ywp;
    }

    public void tz(String str) {
        this.ywp = str;
    }

    public int jq() {
        return this.rt;
    }

    public void yt(int i) {
        this.rt = i;
    }

    public int gqd() {
        return this.qc;
    }

    public void qy(int i) {
        this.qc = i;
    }

    public String fvk() {
        return this.xy;
    }

    public void of(String str) {
        this.xy = str;
    }

    public boolean mua() {
        return this.by;
    }

    public void tmg(boolean z) {
        this.by = z;
    }

    public int vo() {
        return this.ln;
    }

    public void jsj(int i) {
        this.ln = i;
    }

    public int fy() {
        return this.eko;
    }

    public void tsz(int i) {
        this.eko = i;
    }

    public int bxz() {
        return this.oyx;
    }

    public void mk(int i) {
        this.oyx = i;
    }

    public boolean kx() {
        return this.rv;
    }

    public void hc(boolean z) {
        this.rv = z;
    }

    public int jy() {
        return this.wax;
    }

    public void atb(int i) {
        this.wax = i;
    }

    public void gbb(boolean z) {
        this.rc = z;
    }

    public boolean vd() {
        return this.rc;
    }

    public void yt(String str) {
        this.jmx = str;
    }

    public String xf() {
        return this.jmx;
    }

    public void ye(int i) {
        this.zk = i;
    }

    public int uae() {
        return this.zk;
    }

    public List<pcc> gga() {
        return this.bbd;
    }

    public int rc() {
        List<pcc> list = this.bbd;
        if (list == null) {
            return 0;
        }
        for (pcc pccVar : list) {
            if ("translate".equals(pccVar.vy()) && pccVar.qf() < 0) {
                return -pccVar.qf();
            }
        }
        return 0;
    }

    public void pcc(List<pcc> list) {
        this.bbd = list;
    }

    public int kez() {
        return this.pv;
    }

    public void lq(int i) {
        this.pv = i;
    }

    public int ofe() {
        return this.jq;
    }

    public void zti(int i) {
        this.jq = i;
    }

    public int gpa() {
        return this.gqd;
    }

    public void pq(int i) {
        this.gqd = i;
    }

    public boolean az() {
        return this.mua;
    }

    public void jr(boolean z) {
        this.mua = z;
    }

    public int gr() {
        return this.fvk;
    }

    public void mu(int i) {
        this.fvk = i;
    }

    public boolean zpi() {
        return this.vo;
    }

    public void dax(boolean z) {
        this.vo = z;
    }

    public boolean jmx() {
        return this.fy;
    }

    public void nac(boolean z) {
        this.fy = z;
    }

    public int zk() {
        return this.bxz;
    }

    public void nn(int i) {
        this.bxz = i;
    }

    public String rv() {
        return this.gga;
    }

    public boolean xy() {
        return this.kx;
    }

    public void lu(boolean z) {
        this.kx = z;
    }

    public void gm(JSONObject jSONObject) {
        this.vd = jSONObject;
    }

    public JSONObject by() {
        return this.xf;
    }

    public void oo(JSONObject jSONObject) {
        this.xf = jSONObject;
    }

    public void vj(JSONObject jSONObject) {
        this.kez = jSONObject;
    }

    public String ln() {
        return this.pzh;
    }

    public void qy(String str) {
        this.pzh = str;
    }

    public void eko() {
        pcc(this, this.vd);
    }

    public void oyx() {
        pcc(this, this.xf);
    }

    public String pzh() {
        return this.gmh;
    }

    public void jsj(String str) {
        this.gmh = str;
    }

    public long gmh() {
        return this.lc;
    }

    public void pcc(long j) {
        this.lc = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void pcc(wh whVar, JSONObject jSONObject) {
        if (whVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        c = 26;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = Typography.dollar;
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        c = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c = Typography.amp;
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = GMTDateParser.ANY;
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = FileSystemKt.UnixPathSeparator;
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals(U3.i.L)) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = AbstractJsonLexerKt.COLON;
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c = Typography.less;
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = C4761z5.U;
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = Typography.greater;
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    whVar.gm(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    whVar.jr(jSONObject.optString(next));
                    break;
                case 2:
                    whVar.jsj(jSONObject.optString(next));
                    break;
                case 3:
                    whVar.qf(jSONObject.optString(next));
                    break;
                case 4:
                    whVar.vy(jSONObject.optInt(next));
                    break;
                case 5:
                    whVar.lu(jSONObject.optBoolean(next));
                    break;
                case 6:
                    whVar.wh(jSONObject.optBoolean(next));
                    break;
                case 7:
                    whVar.hc(jSONObject.optString(next));
                    break;
                case '\b':
                    whVar.wh((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    whVar.sf(jSONObject.optString(next));
                    break;
                case '\n':
                    whVar.of(jSONObject.optInt(next));
                    break;
                case 11:
                    whVar.gm(jSONObject.optString(next));
                    break;
                case '\f':
                    whVar.gm((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    whVar.oo(jSONObject.optString(next));
                    break;
                case 14:
                    whVar.fum(jSONObject.optString(next));
                    break;
                case 15:
                    whVar.sf(jSONObject.optBoolean(next));
                    break;
                case 16:
                    whVar.ork(jSONObject.optInt(next));
                    break;
                case 17:
                    whVar.ork(jSONObject.optBoolean(next));
                    break;
                case 18:
                    whVar.pcc(jSONObject.optLong(next));
                    break;
                case 19:
                    whVar.tz(jSONObject.optString(next));
                    break;
                case 20:
                    whVar.nac(jSONObject.optInt(next));
                    break;
                case 21:
                    whVar.qy(jSONObject.optInt(next));
                    break;
                case 22:
                    whVar.vy(jSONObject.optBoolean(next));
                    break;
                case 23:
                    whVar.jr(jSONObject.optInt(next));
                    break;
                case 24:
                    whVar.yt(jSONObject.optInt(next));
                    break;
                case 25:
                    whVar.sf(jSONObject.optDouble(next));
                    break;
                case 26:
                    whVar.wh(jSONObject.optDouble(next));
                    break;
                case 27:
                    whVar.gpj(jSONObject.optInt(next));
                    break;
                case 28:
                    whVar.kj(jSONObject.optBoolean(next));
                    break;
                case 29:
                    whVar.vh(jSONObject.optInt(next));
                    break;
                case 30:
                    whVar.wh(jSONObject.optString(next));
                    break;
                case 31:
                    whVar.qf(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    whVar.vh(jSONObject.optString(next));
                    break;
                case '!':
                    whVar.tz(jSONObject.optInt(next));
                    break;
                case '\"':
                    whVar.lo(jSONObject.optString(next));
                    break;
                case '#':
                    whVar.lo(jSONObject.optInt(next));
                    break;
                case '$':
                    whVar.pcc(jSONObject.optBoolean(next));
                    break;
                case '%':
                    whVar.kj((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    whVar.gpj(jSONObject.optString(next));
                    break;
                case '\'':
                    whVar.vj(jSONObject.optString(next));
                    break;
                case '(':
                    whVar.fum(jSONObject.optInt(next));
                    break;
                case ')':
                    whVar.oo((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    whVar.gm(jSONObject.optDouble(next));
                    break;
                case '+':
                    whVar.vj((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    whVar.vh(jSONObject.optBoolean(next));
                    break;
                case '-':
                    whVar.gbb(jSONObject.optBoolean(next));
                    break;
                case '.':
                    whVar.vy((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    whVar.lu(jSONObject.optString(next));
                    break;
                case '0':
                    whVar.atb(jSONObject.optInt(next));
                    break;
                case '1':
                    whVar.qf((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    whVar.kj(jSONObject.optString(next));
                    break;
                case '3':
                    whVar.vy(jSONObject.optString(next));
                    break;
                case '4':
                    whVar.dax(jSONObject.optInt(next));
                    break;
                case '5':
                    whVar.vj(jSONObject.optBoolean(next));
                    break;
                case '6':
                    whVar.hc(jSONObject.optInt(next));
                    break;
                case '7':
                    whVar.nac(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        break;
                    } else {
                        whVar.qf(optJSONObject.optInt("translateY", 0));
                        whVar.kj(optJSONObject.optInt("translateX", 0));
                        whVar.oo(optJSONObject.optDouble("scaleX", 0.0d));
                        whVar.vj(optJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    whVar.oo(jSONObject.optBoolean(next));
                    break;
                case ':':
                    whVar.tmg(jSONObject.optString(next));
                    break;
                case ';':
                    whVar.gbb(jSONObject.optString(next));
                    break;
                case '<':
                    whVar.pcc((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    whVar.dax(jSONObject.optString(next));
                    break;
                case '>':
                    whVar.ork(jSONObject.optString(next));
                    break;
                case '?':
                    whVar.lu(jSONObject.optInt(next));
                    break;
                case '@':
                    whVar.sf((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    whVar.tmg(jSONObject.optInt(next));
                    break;
                case 'B':
                    whVar.gbb(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
