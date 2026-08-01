package com.bytedance.sdk.component.qf.sf;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.hc;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.vy;
import com.bytedance.sdk.component.sf.pcc.wh;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo extends gm {
    hc pcc;

    public oo(vh vhVar) {
        super(vhVar);
        this.pcc = null;
    }

    public void vj(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.pcc = hc.pcc(vy.pcc("application/json; charset=utf-8"), str);
    }

    public void pcc(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            str = JsonUtils.EMPTY_JSON;
        } else {
            str = jSONObject.toString();
        }
        this.pcc = hc.pcc(vy.pcc("application/json; charset=utf-8"), str);
    }

    public void pcc(String str, byte[] bArr) {
        this.pcc = hc.pcc(vy.pcc(str), bArr);
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void pcc(final com.bytedance.sdk.component.qf.pcc.pcc pccVar) {
        try {
            tmg.pcc pccVar2 = new tmg.pcc();
            if (TextUtils.isEmpty(this.kj)) {
                pccVar.pcc(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.vj)) {
                pccVar2.pcc(this.vj);
            }
            if (this.wh > 0) {
                pccVar2.pcc(this.wh);
            }
            pccVar2.sf(this.kj);
            if (this.pcc == null) {
                if (pccVar != null) {
                    pccVar.pcc(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                sf(pccVar2);
                pccVar2.pcc((Object) oo());
                pcc(pccVar2);
                this.gm.pcc(pccVar2.pcc(this.pcc).sf()).pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bytedance.sdk.component.qf.sf.oo.1
                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, IOException iOException) {
                        com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            pccVar3.pcc(oo.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.qf.pcc.pcc] */
                    /* JADX WARN: Type inference failed for: r14v0 */
                    /* JADX WARN: Type inference failed for: r14v1, types: [com.bytedance.sdk.component.qf.sf] */
                    /* JADX WARN: Type inference failed for: r14v10 */
                    /* JADX WARN: Type inference failed for: r14v4 */
                    /* JADX WARN: Type inference failed for: r14v5 */
                    /* JADX WARN: Type inference failed for: r14v6, types: [com.bytedance.sdk.component.qf.sf] */
                    /* JADX WARN: Type inference failed for: r14v7, types: [com.bytedance.sdk.component.qf.sf] */
                    /* JADX WARN: Type inference failed for: r14v8 */
                    /* JADX WARN: Type inference failed for: r14v9 */
                    /* JADX WARN: Type inference failed for: r15v1, types: [com.bytedance.sdk.component.qf.sf] */
                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, gbb gbbVar) throws IOException {
                        ?? r14;
                        String str;
                        ?? r142;
                        String lowerCase;
                        com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            if (gbbVar == null) {
                                pccVar3.pcc(oo.this, new IOException("No response"));
                                return;
                            }
                            oo.this.pcc(gbbVar.vy());
                            IOException iOException = null;
                            try {
                                HashMap hashMap = new HashMap();
                                wh qf = gbbVar.qf();
                                if (qf != null) {
                                    for (int i = 0; i < qf.pcc(); i++) {
                                        String pcc = qf.pcc(i);
                                        String sf = qf.sf(i);
                                        hashMap.put(pcc, sf);
                                        if (pcc != null && pcc.equalsIgnoreCase("content-type")) {
                                            if (sf == null) {
                                                lowerCase = "";
                                            } else {
                                                lowerCase = sf.toLowerCase();
                                            }
                                            hashMap.put("content-type", lowerCase);
                                        }
                                    }
                                }
                                jr wh = gbbVar.wh();
                                if (com.bytedance.sdk.component.qf.gm.pcc.pcc(hashMap)) {
                                    byte[] oo = wh.oo();
                                    r142 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, null, gbbVar.sf(), gbbVar.pcc());
                                    try {
                                        r142.pcc(oo);
                                        r142 = r142;
                                    } catch (Throwable th) {
                                        th = th;
                                        iOException = r142;
                                        r14 = iOException;
                                        iOException = new IOException(th);
                                        if (r14 != 0) {
                                        }
                                    }
                                } else if (oo.this.ork) {
                                    byte[] oo2 = wh.oo();
                                    oo ooVar = oo.this;
                                    ?? sfVar2 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, new String(oo2, ooVar.pcc(ooVar.pcc(wh))), gbbVar.sf(), gbbVar.pcc());
                                    try {
                                        sfVar2.pcc(oo2);
                                        r142 = sfVar2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        iOException = sfVar2;
                                        r14 = iOException;
                                        iOException = new IOException(th);
                                        if (r14 != 0) {
                                        }
                                    }
                                } else {
                                    if (wh == null) {
                                        throw new IOException(gbbVar.vj());
                                    }
                                    boolean oo3 = gbbVar.oo();
                                    int gm = gbbVar.gm();
                                    String vj = gbbVar.vj();
                                    if (wh == null) {
                                        str = "";
                                    } else {
                                        str = wh.sf();
                                    }
                                    r142 = new com.bytedance.sdk.component.qf.sf(oo3, gm, vj, hashMap, str, gbbVar.sf(), gbbVar.pcc());
                                }
                                oo.this.pcc((com.bytedance.sdk.component.qf.sf) r142, gbbVar);
                                r14 = r142;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (r14 != 0) {
                                pccVar.pcc(oo.this, r14);
                                return;
                            }
                            com.bytedance.sdk.component.qf.pcc.pcc pccVar4 = pccVar;
                            if (pccVar4 instanceof com.bytedance.sdk.component.qf.pcc.sf) {
                                com.bytedance.sdk.component.qf.pcc.sf sfVar3 = (com.bytedance.sdk.component.qf.pcc.sf) pccVar4;
                                oo ooVar2 = oo.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                sfVar3.pcc(ooVar2, iOException, new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), null, null, gbbVar.sf(), gbbVar.pcc()));
                                return;
                            }
                            oo ooVar3 = oo.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            pccVar4.pcc(ooVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            pccVar.pcc(this, new IOException(th.getMessage()));
        }
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public com.bytedance.sdk.component.qf.sf pcc() {
        com.bytedance.sdk.component.qf.sf sfVar;
        String str;
        String lowerCase;
        try {
            tmg.pcc pccVar = new tmg.pcc();
            if (TextUtils.isEmpty(this.kj)) {
                return new com.bytedance.sdk.component.qf.sf(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            pccVar.sf(this.kj);
            if (this.pcc == null) {
                return new com.bytedance.sdk.component.qf.sf(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            sf(pccVar);
            pccVar.pcc((Object) oo());
            pcc(pccVar);
            gbb sf = this.gm.pcc(pccVar.pcc(this.pcc).sf()).sf();
            if (sf == null) {
                return null;
            }
            pcc(sf.vy());
            HashMap hashMap = new HashMap();
            wh qf = sf.qf();
            if (qf != null) {
                for (int i = 0; i < qf.pcc(); i++) {
                    String pcc = qf.pcc(i);
                    String sf2 = qf.sf(i);
                    hashMap.put(pcc, sf2);
                    if (pcc != null && pcc.equalsIgnoreCase("content-type")) {
                        if (sf2 == null) {
                            lowerCase = "";
                        } else {
                            lowerCase = sf2.toLowerCase();
                        }
                        hashMap.put("content-type", lowerCase);
                    }
                }
            }
            jr wh = sf.wh();
            if (com.bytedance.sdk.component.qf.gm.pcc.pcc(hashMap)) {
                byte[] oo = wh.oo();
                sfVar = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, null, sf.sf(), sf.pcc());
                sfVar.pcc(oo);
            } else if (this.ork) {
                byte[] oo2 = wh.oo();
                com.bytedance.sdk.component.qf.sf sfVar2 = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, new String(oo2, pcc(pcc(wh))), sf.sf(), sf.pcc());
                sfVar2.pcc(oo2);
                sfVar = sfVar2;
            } else {
                if (wh == null) {
                    throw new IOException(sf.vj());
                }
                boolean oo3 = sf.oo();
                int gm = sf.gm();
                String vj = sf.vj();
                if (wh == null) {
                    str = "";
                } else {
                    str = wh.sf();
                }
                sfVar = new com.bytedance.sdk.component.qf.sf(oo3, gm, vj, hashMap, str, sf.sf(), sf.pcc());
            }
            pcc(sfVar, sf);
            return sfVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.qf.sf(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void pcc(String str, boolean z) {
        if (z) {
            pcc("application/json; charset=utf-8", wh(str));
            sf(HttpHeaders.CONTENT_ENCODING, "gzip");
        } else {
            vj(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] wh(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused2) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            gZIPOutputStream.write(str.getBytes(C4761z5.O));
            try {
                gZIPOutputStream.close();
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException unused6) {
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException unused7) {
                    throw th;
                }
            }
            throw th;
        }
        bArr = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset pcc(vy vyVar) {
        try {
            return vyVar != null ? vyVar.pcc(com.bytedance.sdk.component.sf.pcc.sf.vy.pcc) : com.bytedance.sdk.component.sf.pcc.sf.vy.pcc;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.sf.pcc.sf.vy.pcc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vy pcc(jr jrVar) {
        try {
            return jrVar.vj();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.component.qf.sf sfVar, gbb gbbVar) {
        if (sfVar == null || gbbVar == null) {
            return;
        }
        sfVar.pcc(gbbVar.kj());
    }
}
