package p000;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: nq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0516nq implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5500j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0553oq f5501k;

    public /* synthetic */ CallableC0516nq(C0553oq c0553oq, int i) {
        this.f5500j = i;
        this.f5501k = c0553oq;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        String string;
        switch (this.f5500j) {
            case 0:
                C0553oq c0553oq = this.f5501k;
                synchronized (c0553oq) {
                    try {
                        db0 db0Var = (db0) c0553oq.f5831a.get();
                        ArrayList arrayListM1148a = db0Var.m1148a();
                        synchronized (db0Var) {
                            db0Var.f1612a.m5324a(new ab0(0, db0Var));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (i = 0; i < arrayListM1148a.size(); i++) {
                            C0943z9 c0943z9 = (C0943z9) arrayListM1148a.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c0943z9.f9689a);
                            jSONObject.put("dates", new JSONArray((Collection) c0943z9.f9690b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                C0553oq c0553oq2 = this.f5501k;
                synchronized (c0553oq2) {
                    final db0 db0Var2 = (db0) c0553oq2.f5831a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strM3583a = ((C0517nr) c0553oq2.f5833c.get()).m3583a();
                    synchronized (db0Var2) {
                        final String strM1149b = db0Var2.m1149b(jCurrentTimeMillis);
                        strM3583a.getClass();
                        final rw0 rw0Var = new rw0(strM3583a);
                        db0Var2.f1612a.m5324a(new h60() { // from class: za0
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // p000.h60
                            /* JADX INFO: renamed from: i */
                            public final Object mo170i(Object obj) {
                                Object obj2;
                                db0 db0Var3 = db0Var2;
                                String str = strM1149b;
                                String str2 = strM3583a;
                                rw0 rw0Var2 = rw0Var;
                                zq0 zq0Var = (zq0) obj;
                                Object obj3 = null;
                                if (((String) vk1.m5167c(zq0Var, db0.f1611d, "")).equals(str)) {
                                    rw0 rw0VarM1150c = db0Var3.m1150c(zq0Var, str);
                                    if (rw0VarM1150c == null || rw0VarM1150c.f6986a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (db0Var3) {
                                        db0Var3.m1151d(zq0Var, str);
                                        HashSet hashSet = new HashSet((Collection) vk1.m5167c(zq0Var, rw0Var2, new HashSet()));
                                        hashSet.add(str);
                                        zq0Var.m6025d(rw0Var2, hashSet);
                                    }
                                    return null;
                                }
                                rw0 rw0Var3 = db0.f1610c;
                                long jLongValue = ((Long) vk1.m5167c(zq0Var, rw0Var3, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (db0Var3) {
                                        try {
                                            long jLongValue2 = ((Long) vk1.m5167c(zq0Var, rw0Var3, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : zq0Var.m6022a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((rw0) entry.getKey()).f6986a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            str3.getClass();
                                            zq0Var.m6025d(new rw0(str3), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            zq0Var.m6024c(db0.f1610c, Long.valueOf(jLongValue));
                                        } catch (Throwable th6) {
                                            throw th6;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) vk1.m5167c(zq0Var, rw0Var2, new HashSet()));
                                hashSet4.add(str);
                                zq0Var.m6025d(rw0Var2, hashSet4);
                                zq0Var.m6024c(db0.f1610c, Long.valueOf(jLongValue + 1));
                                zq0Var.m6024c(db0.f1611d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
