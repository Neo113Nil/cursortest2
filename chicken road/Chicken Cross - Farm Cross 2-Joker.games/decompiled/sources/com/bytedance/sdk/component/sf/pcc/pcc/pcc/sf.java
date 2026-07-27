package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.hc;
import com.bytedance.sdk.component.sf.pcc.kj;
import com.bytedance.sdk.component.sf.pcc.tmg;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class sf implements com.bytedance.sdk.component.sf.pcc.sf {
    private static List<Object> vj;
    tmg pcc;
    com.bytedance.sdk.component.sf.pcc.oo sf;
    private AtomicBoolean oo = new AtomicBoolean(false);
    private final String gm = System.identityHashCode(this) + "-" + System.currentTimeMillis();

    static {
        try {
            vj = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum valueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (valueOf != null) {
                vj.add(valueOf);
            }
            Enum valueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (valueOf2 != null) {
                vj.add(valueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    sf(tmg tmgVar, com.bytedance.sdk.component.sf.pcc.oo ooVar) {
        this.pcc = tmgVar;
        this.sf = ooVar;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public tmg pcc() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public gbb sf() throws IOException {
        tmg tmgVar = this.pcc;
        if (tmgVar != null && tmgVar.sf != null) {
            if (this.pcc.sf.gbb() == 0) {
                this.pcc.sf.jr();
            }
            this.pcc.sf.pcc();
        }
        this.sf.gm().remove(this);
        this.sf.oo().add(this);
        com.bytedance.sdk.component.sf.pcc.oo ooVar = this.sf;
        if ((ooVar instanceof wh) && (ooVar.gm().size() + this.sf.oo().size() > this.sf.pcc() || this.oo.get())) {
            this.sf.oo().remove(this);
            return new kj(kj.pcc, "Maximum number of requests exceeded", this.pcc);
        }
        try {
            if (this.pcc.pcc != null && this.pcc.pcc.pcc != null && this.pcc.pcc.pcc.size() > 0) {
                ArrayList arrayList = new ArrayList(this.pcc.pcc.pcc);
                arrayList.add(new com.bytedance.sdk.component.sf.pcc.kj() { // from class: com.bytedance.sdk.component.sf.pcc.pcc.pcc.sf.1
                    @Override // com.bytedance.sdk.component.sf.pcc.kj
                    public gbb pcc(kj.pcc pccVar) throws IOException {
                        return sf.this.pcc(pccVar.pcc());
                    }
                });
                return ((com.bytedance.sdk.component.sf.pcc.kj) arrayList.get(0)).pcc(new gm(arrayList, this.pcc));
            }
            return pcc(this.pcc);
        } finally {
        }
    }

    private boolean pcc(hc hcVar) {
        tmg tmgVar;
        return hcVar != null && (tmgVar = this.pcc) != null && "POST".equalsIgnoreCase(tmgVar.vj()) && hcVar.wh == hc.pcc.BYTE_ARRAY_TYPE && hcVar.vj != null && hcVar.vj.length > 0;
    }

    private boolean sf(hc hcVar) {
        tmg tmgVar;
        return (hcVar == null || (tmgVar = this.pcc) == null || !"POST".equalsIgnoreCase(tmgVar.vj()) || hcVar.wh != hc.pcc.STRING_TYPE || TextUtils.isEmpty(hcVar.oo)) ? false : true;
    }

    public gbb pcc(tmg tmgVar) throws IOException {
        return pcc(tmgVar, com.bytedance.sdk.component.qf.pcc.vj());
    }

    public gbb pcc(tmg tmgVar, boolean z) throws IOException {
        boolean wh = com.bytedance.sdk.component.qf.pcc.wh();
        List<String> pcc = tmgVar != null ? tmgVar.pcc() : null;
        boolean z2 = (pcc == null || pcc.isEmpty()) ? false : true;
        if (wh && z2) {
            return pcc(tmgVar, pcc);
        }
        return sf(tmgVar, z);
    }

    private tmg pcc(tmg tmgVar, String str) {
        return tmgVar.vh().sf(str).sf();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private gbb pcc(tmg tmgVar, List<String> list) throws IOException {
        String str;
        int i;
        long j;
        int i2;
        boolean z;
        int i3;
        gbb sf;
        gbb gbbVar;
        String url = tmgVar.oo().pcc().toString();
        List<String> pcc = com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(url, list);
        long currentTimeMillis = System.currentTimeMillis();
        long sf2 = tmgVar.sf();
        int size = pcc.size();
        boolean z2 = false;
        gbb gbbVar2 = null;
        int i4 = 0;
        while (i4 < size) {
            String str2 = pcc.get(i4);
            boolean z3 = (str2 == null || !str2.equals(url)) ? z2 : true;
            if (System.currentTimeMillis() - currentTimeMillis > sf2) {
                com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str2, -1, "Total timeout", false, i4 + 1, size);
                return gbbVar2 != null ? gbbVar2 : new kj(-1, "Total timeout", tmgVar, str2);
            }
            if (this.oo.get()) {
                com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str2, kj.sf, "Request canceled", false, i4 + 1, size);
                return new kj(kj.sf, "Request canceled", tmgVar, str2);
            }
            try {
                i3 = i4 + 1;
                new StringBuilder("Trying URL[").append(i3).append("/").append(pcc.size()).append("]：").append(z3 ? "primary" : "backup").append(ServerSentEventKt.SPACE).append(str2).append(" current is ");
                sf = sf(z3 ? tmgVar : pcc(tmgVar, str2), com.bytedance.sdk.component.qf.pcc.vj());
                if (sf instanceof kj) {
                    ((kj) sf).pcc(str2);
                }
                try {
                } catch (IOException e) {
                    e = e;
                    gbbVar = sf;
                    str = str2;
                    i = size;
                    j = currentTimeMillis;
                    i2 = i4;
                    z = z2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (sf.oo()) {
                try {
                    new StringBuilder("URL[").append(str2).append("]  success current is ");
                    com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str2, url, true);
                    return sf;
                } catch (IOException e3) {
                    e = e3;
                    gbbVar2 = sf;
                    str = str2;
                    i = size;
                    j = currentTimeMillis;
                    i2 = i4;
                    z = z2;
                    e.getMessage();
                    com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, z);
                    com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, kj.pcc, e.getMessage(), true, i2 + 1, i);
                    if (i2 != pcc.size() - 1) {
                    }
                    i4 = i2 + 1;
                    z2 = z;
                    size = i;
                    currentTimeMillis = j;
                }
            } else {
                com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str2, url, z2);
                gbbVar = sf;
                j = currentTimeMillis;
                i2 = i4;
                z = z2;
                i = size;
                try {
                    com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str2, sf.gm(), sf.vj(), true, i3, size);
                    str = str2;
                } catch (IOException e4) {
                    e = e4;
                    str = str2;
                }
                try {
                    new StringBuilder("URL[").append(str).append("] returns error code ").append(gbbVar.gm()).append(", continue retrying ");
                } catch (IOException e5) {
                    e = e5;
                    gbbVar2 = gbbVar;
                    e.getMessage();
                    com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, z);
                    com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, kj.pcc, e.getMessage(), true, i2 + 1, i);
                    if (i2 != pcc.size() - 1) {
                        e.getMessage();
                    }
                    i4 = i2 + 1;
                    z2 = z;
                    size = i;
                    currentTimeMillis = j;
                }
                if (i2 == pcc.size() - 1) {
                    return gbbVar;
                }
                gbbVar2 = gbbVar;
                i4 = i2 + 1;
                z2 = z;
                size = i;
                currentTimeMillis = j;
            }
        }
        return gbbVar2 != null ? gbbVar2 : new kj(kj.pcc, "No URLs to try", tmgVar, pcc.get(pcc.size() - 1));
    }

    private gbb sf(tmg tmgVar, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e;
        String pcc;
        int responseCode;
        int i = kj.pcc;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(tmgVar.oo().pcc().toString()).openConnection();
            if (z) {
                try {
                    if (!"setting".equals(tmgVar.kj()) && !"gecko".equals(tmgVar.kj()) && !"load_ug_t".equals(tmgVar.kj()) && !"pixel_web".equals(tmgVar.kj())) {
                        sf(httpURLConnection);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (i == -1 && z) {
                        tmgVar.oo().pcc().toString();
                        return sf(tmgVar, false);
                    }
                    pcc = pcc(httpURLConnection, e);
                    return new kj(i, pcc, tmgVar);
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    pcc = pcc(httpURLConnection2, e);
                    return new kj(i, pcc, tmgVar);
                }
            }
            if (tmgVar.wh() != null && !tmgVar.wh().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : tmgVar.wh().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            gm(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            if (tmgVar.pcc != null) {
                if (tmgVar.pcc.gm != null) {
                    httpURLConnection.setConnectTimeout((int) tmgVar.pcc.gm.toMillis(tmgVar.pcc.sf));
                }
                if (tmgVar.pcc.vj != null) {
                    httpURLConnection.setReadTimeout((int) tmgVar.pcc.vj.toMillis(tmgVar.pcc.oo));
                }
            }
            if (tmgVar.ork() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!vj() && tmgVar.ork().gm != null) {
                    httpURLConnection.addRequestProperty("Content-Type", tmgVar.ork().gm.pcc());
                }
                httpURLConnection.setRequestMethod(tmgVar.vj());
                if ("POST".equalsIgnoreCase(tmgVar.vj())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (pcc(tmgVar.ork())) {
                        outputStream.write(tmgVar.ork().vj);
                    } else if (sf(tmgVar.ork())) {
                        outputStream.write(tmgVar.ork().oo.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            if (tmgVar.sf != null) {
                tmgVar.sf.sf();
            }
            httpURLConnection.connect();
            if (tmgVar.sf != null) {
                tmgVar.sf.gm();
            }
            responseCode = httpURLConnection.getResponseCode();
            if (tmgVar.sf != null) {
                tmgVar.sf.vj();
            }
        } catch (IOException e4) {
            httpURLConnection = null;
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
        if (this.oo.get()) {
            i = kj.sf;
            pcc(httpURLConnection);
            pcc = "internal error";
            return new kj(i, pcc, tmgVar);
        }
        return new kj(httpURLConnection, tmgVar, responseCode);
    }

    private void pcc(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private static String pcc(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    private static void sf(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (vj.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, vj);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void gm(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private boolean vj() {
        if (this.pcc.wh() == null) {
            return false;
        }
        return this.pcc.wh().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public void pcc(final com.bytedance.sdk.component.sf.pcc.gm gmVar) {
        tmg tmgVar = this.pcc;
        if (tmgVar != null && tmgVar.sf != null) {
            this.pcc.sf.jr();
        }
        this.sf.sf().submit(new com.bytedance.sdk.component.kj.sf.gm(this.pcc.kj(), this.pcc.vy()) { // from class: com.bytedance.sdk.component.sf.pcc.pcc.pcc.sf.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    gbb sf = sf.this.sf();
                    if (sf == null) {
                        gmVar.pcc(sf.this, new IOException("response is null"));
                    } else {
                        gmVar.pcc(sf.this, sf);
                    }
                } catch (IOException e) {
                    gmVar.pcc(sf.this, e);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public void gm() {
        this.oo.set(true);
    }

    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.sf.pcc.sf clone() {
        return new sf(this.pcc, this.sf);
    }
}
