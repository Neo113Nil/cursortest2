package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.tsx;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class of {
    private String am;
    private zti apl;
    private String bg;
    private String bgf;
    private boolean bxz;
    private int ct;
    private JSONObject dk;
    private String dp;
    private int dt;
    private volatile boolean edk;
    private com.bytedance.sdk.openadsdk.core.hc.kj.pcc ef;
    private String ei;
    private String erj;
    private gbb esn;
    private boolean eud;
    private int ew;
    private jsj fg;
    private int fgl;
    private String fi;
    private lu fmh;
    private String fv;
    private com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf fvk;
    private boolean fy;
    private String gd;
    private hc gdh;
    private pcc gga;
    private wh gh;
    private String gl;
    private String gpj;
    private int gqd;
    public long hc;
    private String hoh;
    private String hu;
    private atb ial;
    private jr ibs;
    private int iv;
    private int ixc;
    private qf iz;
    private fum jkz;
    private int jl;
    private AdSlot jmx;
    private int jq;
    private int jy;
    private JSONObject kez;
    protected int kj;
    private int kot;
    private boolean kx;
    private String kz;
    private int lc;
    private int lo;
    private String lq;
    private JSONObject lr;
    private vj lu;
    private com.bytedance.sdk.openadsdk.core.hc.kj.pcc mbt;
    private String mk;
    private boolean mu;
    private com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf mua;
    private boolean nac;
    private mk nmd;
    private int nn;
    private int oa;
    private long of;
    private int on;
    private String orc;
    private int otd;
    private JSONObject oyx;
    private int pq;
    private long pv;
    private JSONObject pzh;
    private String qcw;
    private String qte;
    private PAGBannerSize qxv;
    private yt qy;
    private kj ray;
    private String rc;
    private nac rf;
    private int ri;
    private int rnn;
    private boolean slc;
    private boolean sod;
    private boolean st;
    private boolean sw;
    private int tg;
    private boolean tqg;
    private String tuy;
    private long tz;
    private Map<String, Object> uae;
    private gpj uij;
    private String uxz;
    private boolean vck;
    private boolean vd;
    private String vgx;
    private com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf vo;
    private String vr;
    protected long vy;
    private int wc;
    private int xb;
    private int xf;
    private String xfm;
    private String xy;
    private com.bytedance.sdk.openadsdk.core.model.pcc ye;
    private int ywc;
    private String ywp;
    private String zgt;
    private int zk;
    private lu zsj;
    private String zti;
    private ye zwm;
    private com.bytedance.sdk.openadsdk.core.gbb.pcc zx;
    public static final String sf = UByte$$ExternalSyntheticBackport0.m((CharSequence) "_", new CharSequence[]{"is", kun.ye()});
    public static final String gm = UByte$$ExternalSyntheticBackport0.m((CharSequence) "_", new CharSequence[]{"is", kun.ye(), "sample"});
    public static final String oo = UByte$$ExternalSyntheticBackport0.m((CharSequence) "_", new CharSequence[]{kun.ye(), U3.f.e});
    protected static int vh = 330;
    private long dax = 0;
    protected boolean pcc = false;
    protected boolean vj = com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc;
    protected int wh = com.bytedance.sdk.openadsdk.qy.pcc.gm.sf;
    protected String qf = com.bytedance.sdk.openadsdk.qy.pcc.gm.gm;
    private int fum = 0;
    private boolean yt = false;
    private List<String> jsj = new ArrayList();
    private int tsz = -1;
    private HashMap<String, String> atb = new HashMap<>();
    protected int ork = 0;
    private final List<lu> tsx = new ArrayList();
    private final List<String> kun = new ArrayList();
    private final List<FilterWord> rj = new ArrayList();
    private final tsx lrr = tsx.gm();
    public boolean tmg = false;
    private int hpk = 0;
    private List<String> se = new ArrayList();
    private List<String> ptr = new ArrayList();
    private String tmh = "0";
    private String ra = "";
    private int rt = 0;
    private int qc = 2;
    private int wax = -1;
    private int bbd = 0;
    private int ofe = 0;
    private int gpa = 1;
    private vh az = new vh();
    private int gr = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int zpi = 0;
    private int rv = 1;
    private int by = 0;
    private int ln = 0;
    private int eko = 0;
    private int gmh = 1;
    private int bq = 1;
    private float gye = 100.0f;
    private int hl = -1;
    private int cz = 2;
    private int wjv = 1;
    private int qxq = 0;
    private int luz = 1;
    private int jk = -1;
    private long jum = -1;
    private int iwd = 0;
    private int we = Integer.MIN_VALUE;
    private boolean wke = false;
    private int pjm = 0;
    private int irz = -1;
    private int zvx = -1;
    private long hh = -1;
    private int wyd = 50;
    private int qra = -1;
    private final sf giw = new sf();
    private boolean qap = false;
    private int zex = 0;
    private com.bytedance.sdk.openadsdk.qy.pcc.sf rx = null;
    protected int gbb = -1;
    protected int jr = -1;
    private float evs = -1.0f;

    public static boolean gdh(int i) {
        return i == 44 || i == 43 || i == 30 || i == 40 || i == 41 || i == 39;
    }

    public boolean yir() {
        return true;
    }

    public yt pcc() {
        return this.qy;
    }

    public int sf() {
        qf se = se();
        if (se != null) {
            return se.pcc();
        }
        return -1;
    }

    public of() {
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = new com.bytedance.sdk.openadsdk.core.model.pcc();
        this.ye = pccVar;
        pccVar.pcc(this);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (pccVar != null) {
            this.ye = pccVar;
        }
    }

    public void pcc(int i) {
        this.nn = i;
    }

    public int gm() {
        return this.nn;
    }

    public com.bytedance.sdk.openadsdk.core.model.pcc oo() {
        return this.ye;
    }

    public String vj() {
        int tqg = tqg();
        if (tqg == 1) {
            return "banner_ad";
        }
        if (tqg == 3) {
            return "open_ad";
        }
        if (tqg == 5) {
            return "embeded_ad";
        }
        if (tqg == 7) {
            return "rewarded_video";
        }
        if (tqg == 8) {
            return "fullscreen_interstitial_ad";
        }
        return "unknown";
    }

    public boolean wh() {
        jsj jsjVar;
        int bg = bg();
        if (xb() && atb.gm(this) && bg != 43 && bg != 44) {
            return false;
        }
        if (!xb() && gdh(bg) && (jsjVar = this.fg) != null && jsjVar.pcc() == 1) {
            return false;
        }
        boolean z = (bg == 33 || bg == 5 || bg == 6 || bg == 19 || bg == 12) ? false : true;
        if (on() || ei() == 2 || !z || !com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh.pcc(kun.gm(this.jk))) {
            return ei() == 2 && z;
        }
        return true;
    }

    public int qf() {
        return this.rnn;
    }

    public void sf(int i) {
        this.rnn = i;
    }

    public String kj() {
        qy vh2;
        com.bytedance.sdk.openadsdk.core.model.pcc oo2 = oo();
        if (oo2 == null || (vh2 = oo2.vh()) == null) {
            return null;
        }
        return vh2.qf();
    }

    public long vy() {
        return this.dax;
    }

    public void pcc(long j) {
        this.dax = j;
    }

    public void gm(int i) {
        this.lo = i;
    }

    public int ork() {
        return this.lo;
    }

    public static boolean pcc(of ofVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (pcc(ofVar) || z4 || ofVar == null || ofVar.kez() == null || TextUtils.isEmpty(ofVar.kez().tmg())) {
            return false;
        }
        return gm(ofVar) ? z3 : (ofVar.kez() == null || ofVar.kez().pcc() != 1) ? z : z2;
    }

    public static boolean pcc(of ofVar) {
        return (ofVar == null || ofVar.kez() == null || ofVar.kez().oo() != 1) ? false : true;
    }

    public static boolean sf(of ofVar) {
        return (pcc(ofVar) || gm(ofVar)) ? false : true;
    }

    public static boolean gm(of ofVar) {
        return (ofVar == null || ofVar.kez() == null || ofVar.kez().oo() != 7 || atb.sf(ofVar)) ? false : true;
    }

    public static boolean oo(of ofVar) {
        return (ofVar == null || ofVar.kez() == null || ofVar.kez().pcc() != 1) ? false : true;
    }

    public static boolean vj(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        int ct = ofVar.ct();
        return ofVar.on() || ct == 5 || ct == 15 || ct == 50;
    }

    public static com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc(String str, of ofVar) {
        ofVar.gd(0);
        int hh = ofVar.hh();
        int i = 3;
        if (hh == 3) {
            i = 4;
        } else if (hh == 7) {
            i = 1;
        } else if (hh == 8) {
            i = 2;
        }
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.core.jr.pcc.sf(str, ofVar.slc(), ofVar.vck(), ofVar.we(), ofVar.wke(), i);
        sfVar.pcc(com.bytedance.sdk.openadsdk.yt.vj.pcc("video_error_conf", 0));
        sfVar.gm(com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf(sfVar.dax()));
        return sfVar;
    }

    public static long pcc(String str) {
        return kj(gm(str));
    }

    private static long kj(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static double sf(String str) {
        return vy(gm(str));
    }

    private static double vy(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static JSONObject gm(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.lo.gm("MaterialMeta", e.getMessage());
            }
        }
        return null;
    }

    public static int oo(String str) {
        return pcc(gm(str));
    }

    public static int pcc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String pcc(Context context, of ofVar) {
        if (context == null || ofVar == null || !((ofVar.hh() == 8 || ofVar.hh() == 7) && ofVar.fy())) {
            return null;
        }
        String sf2 = sf(context, ofVar);
        if (TextUtils.isEmpty(sf2) || com.bytedance.sdk.openadsdk.core.pcc.pcc.pcc() != 1) {
            return null;
        }
        return sf2;
    }

    public static String sf(Context context, of ofVar) {
        if (context != null && ofVar != null) {
            try {
                if (ofVar.az() == 8 || ofVar.qy().pcc()) {
                    String pcc2 = com.bytedance.sdk.openadsdk.core.pcc.pcc.pcc(context);
                    if (TextUtils.isEmpty(pcc2)) {
                        return null;
                    }
                    return pcc2;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public static boolean wh(of ofVar) {
        Object obj;
        if (ofVar == null) {
            return false;
        }
        try {
            Map<String, Object> oa = ofVar.oa();
            if (oa == null || (obj = oa.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public String vh() {
        return this.lq;
    }

    public void vj(String str) {
        this.lq = str;
    }

    public String tmg() {
        return this.zti;
    }

    public void wh(String str) {
        this.zti = str;
    }

    public int hc() {
        return this.pq;
    }

    public void oo(int i) {
        this.pq = i;
    }

    public void pcc(boolean z) {
        this.nac = z;
    }

    public boolean gbb() {
        return this.nac;
    }

    public boolean jr() {
        return this.mu;
    }

    public void sf(boolean z) {
        this.mu = z;
    }

    public boolean dax() {
        return this.sw;
    }

    public void gm(boolean z) {
        this.sw = z;
    }

    public void vj(int i) {
        this.zvx = i;
    }

    public long nac() {
        return this.hh;
    }

    public void sf(long j) {
        this.hh = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            of ofVar = (of) obj;
            if (this.tmh.equals(ofVar.esn()) && this.ywp.equals(ofVar.hl())) {
                return true;
            }
        }
        return false;
    }

    public void wh(int i) {
        this.ork = i;
    }

    public int lu() {
        return this.ork;
    }

    public boolean gpj() {
        return this.fy;
    }

    public void oo(boolean z) {
        this.fy = z;
    }

    public boolean lo() {
        return this.bxz;
    }

    public void vj(boolean z) {
        this.bxz = z;
    }

    public void wh(boolean z) {
        this.kx = z;
    }

    public String fum() {
        return this.uxz;
    }

    public void qf(String str) {
        this.uxz = str;
    }

    public String tz() {
        return this.zgt;
    }

    public void kj(String str) {
        this.zgt = str;
    }

    public boolean of() {
        return (TextUtils.isEmpty(fum()) || TextUtils.isEmpty(tz())) ? false : true;
    }

    public fum yt() {
        return this.jkz;
    }

    public void pcc(kj kjVar) {
        this.ray = kjVar;
    }

    public kj qy() {
        return this.ray;
    }

    public void pcc(fum fumVar) {
        this.jkz = fumVar;
    }

    public void pcc(gpj gpjVar) {
        this.uij = gpjVar;
    }

    public gpj jsj() {
        return this.uij;
    }

    public boolean tsz() {
        return this.eud;
    }

    public void qf(boolean z) {
        this.eud = z;
    }

    public void vy(String str) {
        this.fv = str;
    }

    public String mk() {
        return this.fv;
    }

    public void ork(String str) {
        this.gl = str;
    }

    public String atb() {
        return this.gl;
    }

    public boolean ye() {
        JSONArray optJSONArray;
        List<Integer> pcc2;
        if (kx() != null && (pcc2 = kx().pcc()) != null && pcc2.contains(57)) {
            return true;
        }
        JSONObject xf = xf();
        if (xf != null && (optJSONArray = xf.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (optJSONArray.optInt(i) == 57) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lq() {
        JSONArray optJSONArray;
        JSONObject xf = xf();
        if (xf != null && (optJSONArray = xf.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (optJSONArray.optInt(i) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean zti() {
        JSONArray optJSONArray;
        JSONObject xf = xf();
        if (xf == null || (optJSONArray = xf.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (optJSONArray.optInt(i) == 186) {
                return true;
            }
        }
        return false;
    }

    public String pq() {
        return this.am;
    }

    public boolean mu() {
        return this.sod;
    }

    public com.bytedance.sdk.openadsdk.core.hc.kj.pcc nn() {
        return this.ef;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.kj.pcc pccVar) {
        this.ef = pccVar;
        com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(pccVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void sf(com.bytedance.sdk.openadsdk.core.hc.kj.pcc pccVar) {
        this.mbt = pccVar;
        com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(pccVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public com.bytedance.sdk.openadsdk.core.hc.kj.pcc rnn() {
        return this.mbt;
    }

    public void qf(int i) {
        this.pjm = i;
    }

    public int tsx() {
        return this.pjm;
    }

    public void kj(boolean z) {
        this.slc = z;
    }

    public boolean kun() {
        return this.slc;
    }

    public void vy(boolean z) {
        this.vck = z;
    }

    public boolean rj() {
        return this.vck;
    }

    public int lrr() {
        try {
            JSONObject zvx = zvx();
            if (zvx != null) {
                return zvx.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean iv() {
        return this.st;
    }

    public void ork(boolean z) {
        this.st = z;
    }

    public boolean xb() {
        return this.tqg;
    }

    public void vh(boolean z) {
        this.tqg = z;
    }

    public void kj(int i) {
        this.wyd = i;
    }

    public int ri() {
        return this.wyd;
    }

    public String hpk() {
        JSONObject zvx;
        if (this.qte == null && (zvx = zvx()) != null) {
            this.qte = zvx.optString("cid", "");
        }
        return this.qte;
    }

    public void vh(String str) {
        this.tuy = str;
    }

    public String fmh() {
        return this.tuy;
    }

    public int zsj() {
        if (this.qra < 0) {
            try {
                JSONObject zvx = zvx();
                if (zvx != null) {
                    this.qra = zvx.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.qra = 0;
                }
            } catch (Throwable unused) {
                this.qra = 0;
            }
        }
        return this.qra;
    }

    public void vy(int i) {
        this.jl = i;
    }

    public boolean gd() {
        if (this.jk <= 0) {
            this.jk = hh();
        }
        int i = this.jk;
        return (i == 7 || i == 8) && !vj(this) && kz() != 21 && this.jl == 1;
    }

    public void erj() {
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar = this.fvk;
        if (sfVar == null || TextUtils.isEmpty(sfVar.tmg())) {
            return;
        }
        try {
            if (this.fvk.tmg().contains("style_id")) {
                this.sod = true;
                this.am = Uri.parse(this.fvk.tmg()).getQueryParameters("style_id").get(0);
            } else {
                this.sod = false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm(th.getMessage(), new Object[0]);
        }
    }

    public qf se() {
        return this.iz;
    }

    public void pcc(qf qfVar) {
        this.iz = qfVar;
    }

    public int ptr() {
        qf qfVar = this.iz;
        if (qfVar == null) {
            return 2;
        }
        return qfVar.sf();
    }

    public int hoh() {
        if (ye()) {
            return 5;
        }
        return uxz() ? 4 : 1;
    }

    public long qcw() {
        qf qfVar = this.iz;
        if (qfVar == null) {
            return 0L;
        }
        return qfVar.gm();
    }

    public atb vr() {
        return this.ial;
    }

    public void pcc(atb atbVar) {
        this.ial = atbVar;
    }

    public int bg() {
        return this.xb;
    }

    public void ork(int i) {
        pcc(i, -1);
    }

    public int kz() {
        return this.ri;
    }

    public int ew() {
        return this.hpk;
    }

    public void vh(int i) {
        this.hpk = i;
    }

    public void tmg(int i) {
        this.xb = i;
    }

    public void hc(int i) {
        this.ri = i;
    }

    public void pcc(int i, int i2) {
        this.ri = i;
        this.xb = i;
        if (this.jmx == null) {
            this.xb = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = hh();
        }
        if (this.jmx.getDurationSlotType() == 3 || i2 == 3) {
            this.xb = 14;
            return;
        }
        if (this.jmx.getDurationSlotType() == 7 || this.jmx.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (!this.tqg) {
                if (atb.gm(this)) {
                    this.xb = 12;
                    return;
                } else if (atb.sf(this)) {
                    this.xb = 9;
                    return;
                }
            }
            if (this.ri == 5 && !lo.oo(this)) {
                this.xb = 7;
            }
            if (this.ri == 6 && !lo.sf(this)) {
                this.xb = 7;
            }
            if (this.ri == 8 && mua() != 100) {
                this.xb = 7;
            }
            if (this.ri == 19 && TextUtils.isEmpty(this.gd)) {
                this.xb = 7;
            }
            if (this.ri == 20 && TextUtils.isEmpty(this.gd)) {
                this.xb = 7;
            }
            if (this.ri == 38 && !lo.gm(this)) {
                this.xb = 7;
            }
            if (i < 5) {
                this.xb = 7;
                return;
            }
            return;
        }
        if (!this.tqg && atb.sf(this)) {
            this.xb = 4;
            return;
        }
        if (this.ri == 4 && !atb.sf(this)) {
            this.xb = 0;
        }
        int i3 = this.ri;
        if (i3 == 41) {
            this.xb = 41;
            return;
        }
        if (i >= 5) {
            this.xb = 0;
            return;
        }
        if (i3 == 2 && az() != 3) {
            this.xb = 0;
        } else if (i == 0 || (i == 1 && az() != 3)) {
            this.xb = 0;
        }
    }

    public int tmh() {
        return this.wjv;
    }

    public void pcc(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.wjv = 1;
        } else {
            this.wjv = (int) d;
        }
    }

    public int gh() {
        return this.cz;
    }

    public void sf(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.cz = 2;
        } else {
            this.cz = (int) d;
        }
    }

    public String gdh() {
        return this.ra;
    }

    public void tmg(String str) {
        this.ra = str;
    }

    public int otd() {
        return this.rt;
    }

    public void gbb(int i) {
        this.rt = i;
    }

    public int ei() {
        int i;
        if (this.ofe == 11 && (i = this.qc) == 2) {
            return i;
        }
        int i2 = this.xb;
        if (i2 == 5 || i2 == 6 || i2 == 33) {
            return 1;
        }
        if (nmd()) {
            return 2;
        }
        return this.qc;
    }

    public void jr(int i) {
        this.wax = i;
    }

    public int vgx() {
        return this.wax;
    }

    public void dax(int i) {
        this.qc = i;
    }

    public void nac(int i) {
        this.by = i;
    }

    public void hc(String str) {
        this.xfm = str;
    }

    public boolean ywp() {
        return this.by == 1;
    }

    public int ra() {
        return this.eko;
    }

    public void lu(int i) {
        this.eko = i;
    }

    public int rt() {
        return this.ofe;
    }

    public void gpj(int i) {
        this.ofe = i;
    }

    public int qc() {
        return this.gpa;
    }

    public void lo(int i) {
        this.gpa = i;
    }

    public String wax() {
        return this.bgf;
    }

    public void gbb(String str) {
        this.bgf = str;
    }

    public int bbd() {
        return this.ln;
    }

    public void fum(int i) {
        this.ln = i;
    }

    public void tz(int i) {
        this.rv = i;
    }

    public int pv() {
        if (on()) {
            return 5;
        }
        if (zx() != 100.0f || ei() == 2) {
            return 0;
        }
        return this.zpi;
    }

    public void of(int i) {
        this.zpi = i;
    }

    public vh jq() {
        return this.az;
    }

    public void pcc(vh vhVar) {
        this.az = vhVar;
    }

    public AdSlot gqd() {
        return this.jmx;
    }

    public void pcc(AdSlot adSlot) {
        this.jmx = adSlot;
    }

    public void yt(int i) {
        this.zk = i;
    }

    public int fvk() {
        return this.gr;
    }

    public void qy(int i) {
        this.gr = i;
    }

    public void jsj(int i) {
        this.gmh = i;
    }

    public void tsz(int i) {
        this.lc = i;
    }

    public int mua() {
        return this.gqd;
    }

    public void mk(int i) {
        this.gqd = i;
    }

    public String vo() {
        return this.rc;
    }

    public void jr(String str) {
        this.rc = str;
    }

    public boolean fy() {
        return mua() == 100 || this.xb == 20;
    }

    public int bxz() {
        return this.xf;
    }

    public void atb(int i) {
        this.xf = i;
    }

    public pcc kx() {
        return this.gga;
    }

    public void pcc(pcc pccVar) {
        this.gga = pccVar;
        com.bytedance.sdk.component.adexpress.pcc.gm.oo gga = gga();
        if (gga != null && !jy()) {
            com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc(gga);
        }
        if (pccVar == null || TextUtils.isEmpty(pccVar.hc())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(ojl(), "ad");
    }

    public void pcc(zti ztiVar) {
        this.apl = ztiVar;
        if (ztiVar == null || TextUtils.isEmpty(ztiVar.gm())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(whp(), "adv3");
    }

    public boolean jy() {
        pcc pccVar = this.gga;
        if (pccVar != null) {
            return !TextUtils.isEmpty(pccVar.vh());
        }
        int i = this.ofe;
        return i == 9 || i == 10 || i == 11;
    }

    public void sf(JSONObject jSONObject) {
        this.lr = jSONObject;
    }

    public int vd() {
        JSONObject jSONObject;
        int i = this.we;
        return (Integer.MIN_VALUE != i || (jSONObject = this.lr) == null) ? i : jSONObject.optInt("click_trigger_type", 0);
    }

    public JSONObject xf() {
        return this.lr;
    }

    public zti uae() {
        return this.apl;
    }

    private com.bytedance.sdk.openadsdk.core.hc.kj.pcc ojl() {
        pcc kx = kx();
        if (kx == null) {
            return null;
        }
        return pcc.sf(kx, String.valueOf(kot()));
    }

    private com.bytedance.sdk.openadsdk.core.hc.kj.pcc whp() {
        zti uae = uae();
        if (uae == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.hc.kj.pcc().pcc(uae.pcc()).sf(uae.sf()).gm(uae.gm()).oo(uae.oo()).vj(kot() + "_v3");
    }

    public com.bytedance.sdk.component.adexpress.pcc.gm.oo gga() {
        pcc kx = kx();
        if (kx == null) {
            return null;
        }
        return pcc.pcc(kx, String.valueOf(kot()));
    }

    public int rc() {
        gbb gbbVar = this.esn;
        if (gbbVar == null) {
            return 0;
        }
        return gbbVar.pcc();
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez() {
        return this.fvk;
    }

    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar) {
        this.fvk = sfVar;
    }

    public void pcc(gbb gbbVar) {
        this.esn = gbbVar;
    }

    public String ofe() {
        return this.ei;
    }

    public void dax(String str) {
        this.ei = str;
    }

    public void nac(String str) {
        this.kz = str;
    }

    public String gpa() {
        return this.kz;
    }

    public int az() {
        return this.iv;
    }

    public boolean gr() {
        return this.tg == 1;
    }

    public void ye(int i) {
        this.tg = i;
    }

    public void lq(int i) {
        this.iv = i;
    }

    public boolean zpi() {
        return this.kot == 1;
    }

    public void zti(int i) {
        this.kot = i;
    }

    public void pq(int i) {
        this.wc = i;
    }

    public int jmx() {
        return this.wc;
    }

    public lu zk() {
        return this.fmh;
    }

    public void pcc(lu luVar) {
        pcc(luVar, vh);
        String tsx = tsx(luVar.pcc());
        if (!TextUtils.isEmpty(tsx)) {
            luVar.sf(tsx);
        }
        this.fmh = luVar;
    }

    private String tsx(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.dax.pcc(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    private void pcc(lu luVar, int i) {
        if (luVar != null) {
            try {
                if (TextUtils.isEmpty(luVar.pcc())) {
                    return;
                }
                if (luVar.sf() == 0 && luVar.gm() == 0) {
                    luVar.pcc(i);
                    luVar.sf(i);
                    return;
                }
                if (luVar.sf() == 0) {
                    if (luVar.gm() > i) {
                        luVar.sf(i);
                        luVar.pcc(i);
                        return;
                    } else {
                        luVar.pcc(luVar.gm());
                        return;
                    }
                }
                if (luVar.gm() == 0) {
                    if (luVar.sf() > i) {
                        luVar.sf(i);
                        luVar.pcc(i);
                        return;
                    } else {
                        luVar.sf(luVar.sf());
                        return;
                    }
                }
                if (luVar.sf() > luVar.gm()) {
                    if (luVar.sf() > i) {
                        luVar.sf((int) (i / (luVar.sf() / luVar.gm())));
                        luVar.pcc(i);
                        return;
                    }
                    return;
                }
                if (luVar.gm() > i) {
                    luVar.pcc((int) (i * (luVar.sf() / luVar.gm())));
                    luVar.sf(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void pcc(lu luVar, int i, int i2) {
        try {
            if (luVar.gm() >= i2) {
                luVar.pcc((int) ((luVar.sf() / luVar.gm()) * i2));
                luVar.sf(i2);
            } else if (luVar.sf() >= i) {
                luVar.pcc((int) ((i / i2) * luVar.gm()));
            }
        } catch (Throwable unused) {
        }
    }

    public lu rv() {
        return this.zsj;
    }

    public void sf(lu luVar) {
        this.zsj = luVar;
    }

    public String xy() {
        return this.gd;
    }

    public void lu(String str) {
        this.gd = str;
    }

    public List<lu> by() {
        return this.tsx;
    }

    public void gm(lu luVar) {
        PAGBannerSize ar = ar();
        if (ar != null && ar.getWidth() > 0 && ar.getHeight() > 0) {
            pcc(luVar, rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), ar.getWidth()), rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), ar.getHeight()));
        }
        this.tsx.add(luVar);
    }

    public String ln() {
        return this.erj;
    }

    public void gpj(String str) {
        this.erj = str;
    }

    public List<String> eko() {
        return this.se;
    }

    public List<String> oyx() {
        return this.ptr;
    }

    public List<String> pzh() {
        return this.kun;
    }

    public String gmh() {
        return this.hoh;
    }

    public void lo(String str) {
        this.hoh = str;
    }

    public String lc() {
        return this.qcw;
    }

    public void fum(String str) {
        this.qcw = str;
    }

    public String bgf() {
        if (!TextUtils.isEmpty(this.vr)) {
            return this.vr;
        }
        Context pcc2 = com.bytedance.sdk.openadsdk.core.lu.pcc();
        int az = az();
        if (az != 2 && az != 3) {
            if (az == 4) {
                if (pcc2 != null) {
                    return com.bytedance.sdk.component.utils.tz.pcc(pcc2, "tt_video_download_apk");
                }
                return this.vr;
            }
            if (az != 8) {
                return this.vr;
            }
        }
        if (pcc2 != null) {
            return com.bytedance.sdk.component.utils.tz.pcc(pcc2, "tt_video_mobile_go_detail");
        }
        return this.vr;
    }

    public void tz(String str) {
        this.vr = str;
    }

    public String dp() {
        return this.vr;
    }

    public String esn() {
        return this.tmh;
    }

    public void of(String str) {
        this.tmh = str;
    }

    public String bq() {
        return this.vgx;
    }

    public void yt(String str) {
        this.vgx = str;
    }

    public void qy(String str) {
        this.gpj = str;
    }

    public String gye() {
        return this.gpj;
    }

    public wh xfm() {
        return this.gh;
    }

    public void pcc(wh whVar) {
        this.gh = whVar;
    }

    public hc dt() {
        return this.gdh;
    }

    public void pcc(hc hcVar) {
        this.gdh = hcVar;
    }

    public String hl() {
        return this.ywp;
    }

    public void jsj(String str) {
        this.ywp = str;
    }

    public int ct() {
        return this.otd;
    }

    public void mu(int i) {
        this.otd = i;
    }

    public List<FilterWord> ywc() {
        return this.rj;
    }

    public void pcc(FilterWord filterWord) {
        this.rj.add(filterWord);
    }

    public String cz() {
        return this.dp;
    }

    public void tsz(String str) {
        this.dp = str;
    }

    public long wjv() {
        return this.pv;
    }

    public void gm(long j) {
        this.pv = j;
    }

    public void nn(int i) {
        this.jq = i;
    }

    public boolean qxq() {
        return this.vd;
    }

    public void tmg(boolean z) {
        this.vd = z;
    }

    public Map<String, Object> oa() {
        return this.uae;
    }

    public void pcc(Map<String, Object> map) {
        this.uae = map;
    }

    public JSONObject luz() {
        return this.oyx;
    }

    public void gm(JSONObject jSONObject) {
        this.oyx = jSONObject;
    }

    public JSONObject jkz() {
        return this.pzh;
    }

    public void oo(JSONObject jSONObject) {
        this.pzh = jSONObject;
    }

    public void mk(String str) {
        this.xy = str;
    }

    public int ial() {
        if (this.bq != 2) {
            this.bq = 1;
        }
        return this.bq;
    }

    public void rnn(int i) {
        this.bq = i;
    }

    public float zx() {
        if (this.gye <= 0.0f) {
            this.gye = 100.0f;
        }
        return (this.gye * 1000.0f) / 1000.0f;
    }

    public void pcc(float f) {
        this.gye = f;
    }

    public boolean fi() {
        if (this.tsx.isEmpty()) {
            return false;
        }
        if (this.otd == 4 && this.tsx.size() < 3) {
            return false;
        }
        Iterator<lu> it = this.tsx.iterator();
        while (it.hasNext()) {
            if (!it.next().vj()) {
                return false;
            }
        }
        return true;
    }

    public boolean dk() {
        return !on() && rf() == 1;
    }

    public int rf() {
        return this.bbd;
    }

    public void tsx(int i) {
        this.bbd = i;
    }

    public void vj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.iv = 4;
        this.tmh = jSONObject.optString("id");
        this.ei = jSONObject.optString("source");
        wh whVar = new wh();
        this.gh = whVar;
        whVar.gm(jSONObject.optString("pkg_name"));
        this.gh.sf(jSONObject.optString("name"));
        this.gh.pcc(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public JSONObject hc(boolean z) {
        try {
            String qrz = qrz();
            if (TextUtils.isEmpty(qrz)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("raw_response_info", qrz);
            }
            JSONArray optJSONArray = new JSONObject(qrz).optJSONArray("creatives");
            if (optJSONArray != null && gm() >= 0 && gm() < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(gm());
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, optJSONObject.get(next));
                    }
                }
                AdSlot gqd = gqd();
                if (gqd != null) {
                    jSONObject.put("adslot", gqd.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.fv)) {
                    jSONObject.put("gdid_encrypted", this.fv);
                }
                jSONObject.put("hasReportShow", this.st);
                jSONObject.put("isMrcReportFinish", this.edk);
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("MaterialMeta", "toJsonObj error", e);
            return null;
        }
    }

    public JSONObject fgl() {
        JSONObject hc = hc(false);
        JSONObject gpj = com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj(String.valueOf(kot()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(hc);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", gpj);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("MaterialMeta", "toJsonObjPlus", e.getMessage());
        }
        return jSONObject;
    }

    public int edk() {
        return this.dt;
    }

    public void kun(int i) {
        this.dt = i;
    }

    public int jk() {
        int i = this.hl;
        if (i >= 0) {
            return i;
        }
        return 30;
    }

    public void rj(int i) {
        this.hl = i;
    }

    public void lrr(int i) {
        this.tsz = i;
    }

    public int jum() {
        return this.ct;
    }

    public void iv(int i) {
        this.ct = i;
    }

    public int orc() {
        return this.ywc;
    }

    public void xb(int i) {
        this.ywc = i;
    }

    public boolean on() {
        int i = this.iwd;
        return (i == 1 || i == 3) && ibs() != null;
    }

    public boolean ixc() {
        return on() || this.lu != null;
    }

    public com.bytedance.sdk.openadsdk.core.gbb.pcc ibs() {
        return this.zx;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) {
        this.zx = pccVar;
    }

    public boolean uxz() {
        return this.iwd == 2;
    }

    public String zgt() {
        return this.fi;
    }

    public void atb(String str) {
        this.fi = str;
    }

    public int iz() {
        JSONObject jSONObject = this.dk;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public JSONObject eud() {
        return this.dk;
    }

    public void wh(JSONObject jSONObject) {
        this.dk = jSONObject;
    }

    public void pcc(nac nacVar) {
        this.rf = nacVar;
    }

    public nac fv() {
        return this.rf;
    }

    public boolean iwd() {
        return this.fgl == 1;
    }

    public void ri(int i) {
        this.fgl = i;
    }

    public void gl() {
        this.edk = true;
    }

    public boolean am() {
        return this.edk;
    }

    public int sod() {
        return this.on;
    }

    public void hpk(int i) {
        this.on = Math.max(0, i);
    }

    public int ef() {
        return this.ixc;
    }

    public void fmh(int i) {
        this.ixc = i;
    }

    public void pcc(jr jrVar) {
        this.ibs = jrVar;
    }

    public jr mbt() {
        return this.ibs;
    }

    public void zsj(int i) {
        this.jy = i;
    }

    public int apl() {
        return this.jy;
    }

    public com.bytedance.sdk.component.vy.sf.pcc lr() {
        com.bytedance.sdk.component.vy.sf.pcc pccVar = new com.bytedance.sdk.component.vy.sf.pcc();
        pccVar.sf(this.xf);
        pccVar.sf(this.tmh);
        pccVar.gm(this.vgx);
        pccVar.pcc(hl());
        pccVar.pcc(this.ofe);
        return pccVar;
    }

    public int we() {
        return this.qxq;
    }

    public void gd(int i) {
        this.qxq = i;
    }

    public int wke() {
        return this.oa;
    }

    public void erj(int i) {
        this.oa = i;
    }

    public int pjm() {
        return this.luz;
    }

    public void se(int i) {
        this.luz = i;
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf slc() {
        return this.vo;
    }

    public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar) {
        this.vo = sfVar;
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf vck() {
        return this.mua;
    }

    public void gm(com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar) {
        this.mua = sfVar;
    }

    public String sw() {
        return this.bg;
    }

    public void ye(String str) {
        this.bg = str;
    }

    public int st() {
        return this.ew;
    }

    public void ptr(int i) {
        this.ew = i;
    }

    public boolean irz() {
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar = this.fvk;
        return sfVar == null || sfVar.gpj() != 1;
    }

    public JSONObject zvx() {
        if (this.kez == null) {
            try {
                if (!TextUtils.isEmpty(this.ywp)) {
                    this.kez = new JSONObject(this.ywp);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.lo.gm("MaterialMeta", e.getMessage());
            }
        }
        return this.kez;
    }

    public int hh() {
        if (this.jk < 0) {
            JSONObject zvx = zvx();
            if (zvx != null) {
                this.jk = zvx.optInt("ad_slot_type", 0);
            } else {
                this.jk = 0;
            }
        }
        return this.jk;
    }

    public int tqg() {
        return this.jk;
    }

    public long wyd() {
        if (this.jum < 0) {
            JSONObject zvx = zvx();
            if (zvx != null) {
                this.jum = zvx.optLong("ad_id", 0L);
            } else {
                this.jum = 0L;
            }
        }
        return this.jum;
    }

    public boolean qte() {
        return hh() == 3 || hh() == 4;
    }

    public boolean tuy() {
        return hh() == 7;
    }

    public boolean qra() {
        return hh() == 8;
    }

    public boolean jl() {
        return hh() == 1;
    }

    public boolean tg() {
        return hh() == 5;
    }

    public int kot() {
        JSONObject zvx = zvx();
        if (zvx != null) {
            return zvx.optInt("rit", 0);
        }
        return 0;
    }

    public double wc() {
        return vy(zvx());
    }

    public String lq(String str) {
        JSONObject zvx = zvx();
        return zvx != null ? zvx.optString("rit", str) : str;
    }

    public String ray() {
        wh xfm = xfm();
        if (xfm == null || TextUtils.isEmpty(xfm.pcc())) {
            return null;
        }
        return xfm.pcc();
    }

    public String qxv() {
        JSONObject zvx;
        String str = this.orc;
        if (TextUtils.isEmpty(str) && (zvx = zvx()) != null) {
            str = zvx.optString("req_id", "");
            zti(str);
        }
        return str == null ? "" : str;
    }

    public void zti(String str) {
        this.orc = str;
    }

    public boolean nmd() {
        return gqd() != null && gqd().getDurationSlotType() == 8 && uxz();
    }

    public int fg() {
        return this.iwd;
    }

    public void hoh(int i) {
        this.iwd = i;
    }

    public boolean zwm() {
        int i = this.xb;
        return (i == 2 || i == 1) && 3 == this.iv;
    }

    public boolean giw() {
        jr jrVar;
        return on() && !qap() && (jrVar = this.ibs) != null && jrVar.pcc() == 1;
    }

    public boolean qap() {
        return this.lrr.pcc > 0;
    }

    public tsx uij() {
        return this.lrr;
    }

    public void hu() {
        this.lrr.vj();
        qf(false);
    }

    public long zex() {
        return this.hc;
    }

    public void oo(long j) {
        this.hc = j;
    }

    public boolean rx() {
        return this.tmg;
    }

    public void gbb(boolean z) {
        this.tmg = z;
    }

    public void jr(boolean z) {
        this.wke = z;
    }

    public boolean evs() {
        return this.wke;
    }

    public void pcc(mk mkVar) {
        this.nmd = mkVar;
    }

    public mk gmi() {
        return this.nmd;
    }

    public boolean afj() {
        return this.pcc;
    }

    public void dax(boolean z) {
        this.pcc = z;
    }

    public void pcc(PAGBannerSize pAGBannerSize) {
        this.qxv = pAGBannerSize;
    }

    public PAGBannerSize ar() {
        return this.qxv;
    }

    public String qrz() {
        return this.hu;
    }

    public void pq(String str) {
        this.hu = str;
    }

    public int fq() {
        return this.zex;
    }

    public void qcw(int i) {
        this.zex = i;
    }

    public void qf(JSONObject jSONObject) {
        this.giw.pcc(jSONObject);
    }

    public sf bo() {
        return this.giw;
    }

    public void nac(boolean z) {
        this.qap = z;
    }

    public boolean duh() {
        return this.qap;
    }

    public boolean ss() {
        gpj gpjVar;
        if (this.jmx == null || (gpjVar = this.uij) == null) {
            return false;
        }
        return gpjVar.pcc(!TextUtils.isEmpty(r0.getBidAdm()));
    }

    public int rq() {
        return this.kj;
    }

    public void vr(int i) {
        this.kj = i;
    }

    public long wsb() {
        return this.vy;
    }

    public void vj(long j) {
        this.vy = j;
    }

    public void pcc(jsj jsjVar) {
        this.fg = jsjVar;
    }

    public jsj nfv() {
        return this.fg;
    }

    public int msk() {
        Map<String, Object> map = this.uae;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void lu(boolean z) {
        this.vj = z;
    }

    public boolean feh() {
        return this.vj;
    }

    public void bg(int i) {
        if (i < 0 || i > 30) {
            i = 6;
        }
        this.wh = i;
    }

    public int mo() {
        return this.wh;
    }

    public void mu(String str) {
        if (TextUtils.isEmpty(str)) {
            this.qf = com.bytedance.sdk.openadsdk.qy.pcc.gm.gm;
        } else {
            this.qf = str;
        }
    }

    public String hk() {
        return this.qf;
    }

    public com.bytedance.sdk.openadsdk.qy.pcc.sf ap() {
        return this.rx;
    }

    public void pcc(com.bytedance.sdk.openadsdk.qy.pcc.sf sfVar) {
        this.rx = sfVar;
    }

    public int cm() {
        String valueOf;
        com.bytedance.sdk.openadsdk.core.model.pcc oo2 = oo();
        if (oo2 != null && oo2.vh() != null) {
            return oo2.vh().vy();
        }
        if (gqd() != null) {
            valueOf = gqd().getCodeId();
        } else {
            int kot = kot();
            valueOf = kot != 0 ? String.valueOf(kot) : null;
        }
        if (valueOf != null) {
            return com.bytedance.sdk.openadsdk.core.lu.oo().lo(valueOf);
        }
        return 5;
    }

    public int jla() {
        String valueOf;
        com.bytedance.sdk.openadsdk.core.model.pcc oo2 = oo();
        if (oo2 != null && oo2.vh() != null) {
            return oo2.vh().vy();
        }
        if (gqd() != null) {
            valueOf = gqd().getCodeId();
        } else {
            int kot = kot();
            valueOf = kot != 0 ? String.valueOf(kot) : null;
        }
        if (valueOf != null) {
            return com.bytedance.sdk.openadsdk.core.lu.oo().tmg(valueOf);
        }
        return 30;
    }

    public void kz(int i) {
        this.gbb = i;
    }

    public void ew(int i) {
        this.jr = i;
    }

    public int bm() {
        int i = this.gbb;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.lu.oo().lo(String.valueOf(kot()));
    }

    public int quq() {
        int i = this.jr;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.lu.oo().vh(String.valueOf(kot()));
    }

    public int ibq() {
        return this.jr;
    }

    public List<of> ky() {
        return this.ye.vj();
    }

    public ye uk() {
        return this.zwm;
    }

    public void pcc(ye yeVar) {
        this.zwm = yeVar;
    }

    public float nyw() {
        float f = this.evs;
        if (f > 0.0f) {
            return f;
        }
        zti ztiVar = this.apl;
        if (ztiVar != null) {
            String oo2 = ztiVar.oo();
            if (TextUtils.isEmpty(oo2)) {
                oo2 = com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc("adv3", this.apl.pcc(), this.apl.sf());
            }
            if (oo2 != null) {
                try {
                    JSONObject optJSONObject = new JSONObject(oo2).optJSONObject("body");
                    if (optJSONObject != null) {
                        float optDouble = (float) optJSONObject.optDouble("ratio");
                        this.evs = optDouble;
                        return optDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.evs = 0.0f;
        return 0.0f;
    }

    public void su() {
        if (!TextUtils.isEmpty(wax())) {
            gbb("0");
        }
        Map<String, Object> oa = oa();
        if (oa == null || !oa.containsKey("price")) {
            return;
        }
        oa.put("price", "0");
    }

    public long hds() {
        Map<String, Object> oa = oa();
        if (oa == null) {
            return 0L;
        }
        try {
            Object obj = oa.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public void pcc(vj vjVar) {
        this.lu = vjVar;
    }

    public vj jvi() {
        return this.lu;
    }

    public oo gto() {
        oo hc;
        vj vjVar = this.lu;
        if (vjVar != null) {
            hc = vjVar.sf();
        } else {
            com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar = this.zx;
            hc = pccVar != null ? pccVar.hc() : null;
        }
        if (hc != null) {
            hc.pcc(this);
        }
        return hc;
    }

    public void pcc(yt ytVar) {
        this.qy = ytVar;
    }

    public void nn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.jsj.add(str);
    }

    public void pcc(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        this.atb = hashMap;
    }

    public HashMap<String, String> bkt() {
        return this.atb;
    }

    public List<String> go() {
        return this.jsj;
    }

    public boolean jkt() {
        yt ytVar = this.qy;
        return ytVar != null && ytVar.pcc() > 0;
    }

    public int ys() {
        int i = this.tsz;
        return i >= 0 ? i : tuy() ? 30 : 5;
    }

    public void wh(long j) {
        this.tz = j;
    }

    public long zr() {
        return this.tz;
    }

    public void qf(long j) {
        this.of = j;
    }

    public long ni() {
        return this.of;
    }

    public void tmh(int i) {
        this.fum = i;
    }

    public int aq() {
        return this.fum;
    }

    public void gpj(boolean z) {
        this.yt = z;
    }

    public boolean ti() {
        return this.yt;
    }

    public void gh(int i) {
        this.irz = i;
    }

    public int mnz() {
        return this.irz;
    }

    public static class pcc {
        private String gbb;
        private String gm;
        private String hc;
        private List<Integer> kj;
        private String oo;
        private String ork;
        private String pcc;
        private String qf;
        private String sf;
        private String tmg;
        private String vh;
        private String vj;
        private String vy;
        private String wh;

        public static com.bytedance.sdk.component.adexpress.pcc.gm.oo pcc(pcc pccVar, String str) {
            return com.bytedance.sdk.component.adexpress.pcc.gm.oo.pcc().pcc(pccVar.oo()).sf(pccVar.vj()).gm(pccVar.wh()).oo(pccVar.qf()).vj(pccVar.gm()).wh(str);
        }

        public static com.bytedance.sdk.openadsdk.core.hc.kj.pcc sf(pcc pccVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.hc.kj.pcc().pcc(pccVar.oo()).sf(pccVar.gbb()).gm(pccVar.hc()).oo(pccVar.jr()).vj(str);
        }

        public List<Integer> pcc() {
            return this.kj;
        }

        public void pcc(List<Integer> list) {
            this.kj = list;
        }

        public String sf() {
            return this.vy;
        }

        public void pcc(String str) {
            this.vy = str;
        }

        public String gm() {
            return this.wh;
        }

        public void sf(String str) {
            this.wh = str;
        }

        public String oo() {
            return this.pcc;
        }

        public void gm(String str) {
            this.pcc = str;
        }

        public String vj() {
            return this.sf;
        }

        public void oo(String str) {
            this.sf = str;
        }

        public String wh() {
            return this.gm;
        }

        public void vj(String str) {
            this.gm = str;
        }

        public String qf() {
            return this.oo;
        }

        public void wh(String str) {
            this.oo = str;
        }

        public String kj() {
            return this.vj;
        }

        public void qf(String str) {
            this.vj = str;
        }

        public String vy() {
            return this.qf;
        }

        public void kj(String str) {
            this.qf = str;
        }

        public String ork() {
            return this.vh;
        }

        public void vy(String str) {
            this.vh = str;
        }

        public String vh() {
            return this.ork;
        }

        public void ork(String str) {
            this.ork = str;
        }

        public boolean tmg() {
            return !TextUtils.isEmpty(this.ork) && this.ork.equals("v3");
        }

        public String hc() {
            return this.tmg;
        }

        public void vh(String str) {
            this.tmg = str;
        }

        public String gbb() {
            return this.hc;
        }

        public void tmg(String str) {
            this.hc = str;
        }

        public String jr() {
            return this.gbb;
        }

        public void hc(String str) {
            this.gbb = str;
        }
    }

    public static void pcc(of ofVar, JSONObject jSONObject) throws JSONException {
        List<lu> by = ofVar.by();
        if (by != null) {
            JSONArray jSONArray = new JSONArray();
            for (lu luVar : by) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", luVar.pcc());
                jSONObject2.put("height", luVar.gm());
                jSONObject2.put("width", luVar.sf());
                jSONObject2.put("image_preview", luVar.wh());
                jSONObject2.put("image_key", luVar.qf());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }

    public static void sf(of ofVar, JSONObject jSONObject) throws JSONException {
        wh xfm = ofVar.xfm();
        if (xfm != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, xfm.sf());
            jSONObject2.put("package_name", xfm.gm());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, xfm.pcc());
            jSONObject2.put("score", xfm.oo());
            jSONObject2.put("comment_num", xfm.vj());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, xfm.wh());
            jSONObject2.put("app_category", xfm.qf());
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    public boolean prg() {
        jsj jsjVar = this.fg;
        if (jsjVar == null || jsjVar.sf() != 1) {
            return false;
        }
        yt ytVar = this.qy;
        return ytVar == null || ytVar.pcc() <= 0;
    }

    public boolean aj() {
        int i = this.ri;
        return i == 44 || i == 43;
    }

    public void rnn(String str) {
        this.mk = str;
    }

    public String yez() {
        return this.mk;
    }
}
