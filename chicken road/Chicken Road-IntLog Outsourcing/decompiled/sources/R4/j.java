package R4;

import android.media.AudioManager;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import g4.AbstractC0465j;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2685a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, Object obj, Class cls, String str, String str2, int i3, int i6) {
        super(i2, obj, cls, str, str2, i3);
        this.f2685a = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        m5.h hVar;
        m5.h hVar2;
        m5.h hVar3;
        m5.h hVar4;
        m5.h hVar5;
        m5.h hVar6;
        m5.h hVar7;
        f4.v vVar = f4.v.f5689a;
        switch (this.f2685a) {
            case 0:
                N4.e p02 = (N4.e) obj;
                int intValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.i.e(p02, "p0");
                k kVar = (k) this.receiver;
                kVar.getClass();
                if (!p02.i(intValue)) {
                    p02.h(intValue).f();
                }
                kVar.f2687b = false;
                return false;
            case 1:
                H2.l p03 = (H2.l) obj;
                H2.n p12 = (H2.n) obj2;
                kotlin.jvm.internal.i.e(p03, "p0");
                kotlin.jvm.internal.i.e(p12, "p1");
                l5.c cVar = (l5.c) this.receiver;
                cVar.getClass();
                String str = (String) p03.a("playerId");
                if (str != null) {
                    String str2 = p03.f1146a;
                    boolean a6 = kotlin.jvm.internal.i.a(str2, "create");
                    ConcurrentHashMap concurrentHashMap = cVar.f11074e;
                    if (a6) {
                        H2.f fVar = cVar.f11072c;
                        if (fVar == null) {
                            kotlin.jvm.internal.i.l("binaryMessenger");
                            throw null;
                        }
                        B0.t tVar = new B0.t(new B4.i(fVar, "xyz.luan/audioplayers/events/".concat(str)));
                        l5.a b6 = l5.a.b(cVar.f11075f);
                        B0.c cVar2 = cVar.f11073d;
                        if (cVar2 == null) {
                            kotlin.jvm.internal.i.l("soundPoolManager");
                            throw null;
                        }
                        concurrentHashMap.put(str, new m5.n(cVar, tVar, b6, cVar2));
                        p12.success(1);
                    } else {
                        m5.n nVar = (m5.n) concurrentHashMap.get(str);
                        if (nVar == null) {
                            throw new IllegalStateException("Player has not yet been created or has already been disposed.");
                        }
                        if (str2 != null) {
                            try {
                                int hashCode = str2.hashCode();
                                B0.t tVar2 = nVar.f11247b;
                                switch (hashCode) {
                                    case -1757019252:
                                        if (str2.equals("getCurrentPosition")) {
                                            p12.success((!nVar.f11258m || (hVar = nVar.f11250e) == null) ? null : hVar.m());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -1722943962:
                                        if (str2.equals("setPlayerMode")) {
                                            String str3 = (String) p03.a("playerMode");
                                            l5.d valueOf = str3 == null ? null : l5.d.valueOf(K1.b.r0((String) AbstractC0465j.L0(B4.k.i0(str3, new char[]{'.'}))));
                                            if (valueOf == null) {
                                                throw new IllegalStateException("playerMode is required");
                                            }
                                            nVar.g(valueOf);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -1660487654:
                                        if (str2.equals("setBalance")) {
                                            Double d6 = (Double) p03.a("balance");
                                            if (d6 == null) {
                                                throw new IllegalStateException("balance is required");
                                            }
                                            float doubleValue = (float) d6.doubleValue();
                                            if (nVar.f11253h != doubleValue) {
                                                nVar.f11253h = doubleValue;
                                                if (!nVar.f11257l && (hVar2 = nVar.f11250e) != null) {
                                                    m5.n.j(hVar2, nVar.f11252g, doubleValue);
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case -1630329231:
                                        if (str2.equals("emitLog")) {
                                            String str4 = (String) p03.a(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                                            if (str4 == null) {
                                                throw new IllegalStateException("message is required");
                                            }
                                            nVar.c(str4);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -934426579:
                                        if (str2.equals("resume")) {
                                            if (!nVar.f11259n && !nVar.f11257l) {
                                                nVar.f11259n = true;
                                                if (nVar.f11250e == null) {
                                                    m5.h b7 = nVar.b();
                                                    nVar.f11250e = b7;
                                                    n5.c cVar3 = nVar.f11251f;
                                                    if (cVar3 != null) {
                                                        b7.c(cVar3);
                                                        nVar.a(b7);
                                                    }
                                                } else if (nVar.f11258m) {
                                                    nVar.f();
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -402284771:
                                        if (str2.equals("setPlaybackRate")) {
                                            Double d7 = (Double) p03.a("playbackRate");
                                            if (d7 == null) {
                                                throw new IllegalStateException("playbackRate is required");
                                            }
                                            float doubleValue2 = (float) d7.doubleValue();
                                            if (nVar.f11254i != doubleValue2) {
                                                nVar.f11254i = doubleValue2;
                                                if (nVar.f11259n && (hVar3 = nVar.f11250e) != null) {
                                                    hVar3.g(doubleValue2);
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -159032046:
                                        if (str2.equals("setSourceUrl")) {
                                            String str5 = (String) p03.a("url");
                                            if (str5 == null) {
                                                throw new IllegalStateException("url is required");
                                            }
                                            Boolean bool = (Boolean) p03.a("isLocal");
                                            try {
                                                nVar.i(new n5.d(str5, bool != null ? bool.booleanValue() : false));
                                                p12.success(1);
                                                break;
                                            } catch (FileNotFoundException e3) {
                                                p12.b("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", e3);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 3526264:
                                        if (str2.equals("seek")) {
                                            Integer num = (Integer) p03.a("position");
                                            if (num == null) {
                                                throw new IllegalStateException("position is required");
                                            }
                                            int intValue2 = num.intValue();
                                            if (nVar.f11258m && ((hVar4 = nVar.f11250e) == null || !hVar4.f())) {
                                                m5.h hVar8 = nVar.f11250e;
                                                if (hVar8 != null) {
                                                    hVar8.h(intValue2);
                                                }
                                                intValue2 = -1;
                                            }
                                            nVar.f11260o = intValue2;
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3540994:
                                        if (str2.equals("stop")) {
                                            nVar.k();
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 85887754:
                                        if (str2.equals("getDuration")) {
                                            p12.success((!nVar.f11258m || (hVar5 = nVar.f11250e) == null) ? null : hVar5.e());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 106440182:
                                        if (str2.equals("pause")) {
                                            nVar.d();
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 670514716:
                                        if (str2.equals("setVolume")) {
                                            Double d8 = (Double) p03.a("volume");
                                            if (d8 == null) {
                                                throw new IllegalStateException("volume is required");
                                            }
                                            float doubleValue3 = (float) d8.doubleValue();
                                            if (nVar.f11252g != doubleValue3) {
                                                nVar.f11252g = doubleValue3;
                                                if (!nVar.f11257l && (hVar6 = nVar.f11250e) != null) {
                                                    m5.n.j(hVar6, doubleValue3, nVar.f11253h);
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 910310901:
                                        if (str2.equals("emitError")) {
                                            String str6 = (String) p03.a("code");
                                            if (str6 == null) {
                                                throw new IllegalStateException("code is required");
                                            }
                                            String str7 = (String) p03.a(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                                            if (str7 == null) {
                                                throw new IllegalStateException("message is required");
                                            }
                                            nVar.f11246a.getClass();
                                            tVar2.d(str6, str7, null);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1090594823:
                                        if (str2.equals("release")) {
                                            nVar.e();
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1671767583:
                                        if (str2.equals("dispose")) {
                                            nVar.e();
                                            tVar2.c();
                                            concurrentHashMap.remove(str);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1771699022:
                                        if (str2.equals("setSourceBytes")) {
                                            byte[] bArr = (byte[]) p03.a("bytes");
                                            if (bArr == null) {
                                                throw new IllegalStateException("bytes are required");
                                            }
                                            nVar.i(new n5.b(bArr));
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1902436987:
                                        if (str2.equals("setAudioContext")) {
                                            nVar.l(K1.b.y(p03));
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2096116872:
                                        if (str2.equals("setReleaseMode")) {
                                            String str8 = (String) p03.a("releaseMode");
                                            l5.e valueOf2 = str8 == null ? null : l5.e.valueOf(K1.b.r0((String) AbstractC0465j.L0(B4.k.i0(str8, new char[]{'.'}))));
                                            if (valueOf2 == null) {
                                                throw new IllegalStateException("releaseMode is required");
                                            }
                                            if (nVar.f11255j != valueOf2) {
                                                nVar.f11255j = valueOf2;
                                                if (!nVar.f11257l && (hVar7 = nVar.f11250e) != null) {
                                                    hVar7.b(valueOf2 == l5.e.f11079b);
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            } catch (Exception e6) {
                                p12.b("AndroidAudioError", e6.getMessage(), e6);
                            }
                        }
                        p12.a();
                    }
                }
                return vVar;
            default:
                H2.l p04 = (H2.l) obj;
                H2.n p13 = (H2.n) obj2;
                kotlin.jvm.internal.i.e(p04, "p0");
                kotlin.jvm.internal.i.e(p13, "p1");
                l5.c cVar4 = (l5.c) this.receiver;
                cVar4.getClass();
                String str9 = p04.f1146a;
                if (str9 != null) {
                    switch (str9.hashCode()) {
                        case -1630329231:
                            if (str9.equals("emitLog")) {
                                String str10 = (String) p04.a(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                                if (str10 == null) {
                                    throw new IllegalStateException("message is required");
                                }
                                cVar4.b(str10);
                                p13.success(1);
                                return vVar;
                            }
                            break;
                        case 3237136:
                            if (str9.equals("init")) {
                                ConcurrentHashMap concurrentHashMap2 = cVar4.f11074e;
                                Collection<m5.n> values = concurrentHashMap2.values();
                                kotlin.jvm.internal.i.d(values, "<get-values>(...)");
                                for (m5.n nVar2 : values) {
                                    nVar2.e();
                                    nVar2.f11247b.c();
                                }
                                concurrentHashMap2.clear();
                                p13.success(1);
                                return vVar;
                            }
                            break;
                        case 910310901:
                            if (str9.equals("emitError")) {
                                String str11 = (String) p04.a("code");
                                if (str11 == null) {
                                    throw new IllegalStateException("code is required");
                                }
                                String str12 = (String) p04.a(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                                if (str12 == null) {
                                    throw new IllegalStateException("message is required");
                                }
                                B0.t tVar3 = cVar4.f11070a;
                                if (tVar3 == null) {
                                    kotlin.jvm.internal.i.l("globalEvents");
                                    throw null;
                                }
                                tVar3.d(str11, str12, null);
                                p13.success(1);
                                return vVar;
                            }
                            break;
                        case 1902436987:
                            if (str9.equals("setAudioContext")) {
                                AudioManager a7 = cVar4.a();
                                a7.setMode(cVar4.f11075f.f11067f);
                                a7.setSpeakerphoneOn(cVar4.f11075f.f11062a);
                                cVar4.f11075f = K1.b.y(p04);
                                p13.success(1);
                                return vVar;
                            }
                            break;
                    }
                }
                p13.a();
                return vVar;
        }
    }
}
