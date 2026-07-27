package G2;

import H2.h;
import T1.l;
import T1.n;
import a.AbstractC0086a;
import android.media.AudioManager;
import d2.C0279i;
import e2.AbstractC0292g;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o2.p;
import v2.m;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f441a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, obj, cls, str, str2, i4);
        this.f441a = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        h hVar7;
        C0279i c0279i = C0279i.f4852a;
        switch (this.f441a) {
            case 0:
                l p02 = (l) obj;
                n p12 = (n) obj2;
                j.e(p02, "p0");
                j.e(p12, "p1");
                d dVar = (d) this.receiver;
                dVar.getClass();
                String str = (String) p02.a("playerId");
                if (str != null) {
                    String str2 = p02.f1468a;
                    boolean a3 = j.a(str2, "create");
                    ConcurrentHashMap concurrentHashMap = dVar.f446e;
                    if (a3) {
                        T1.f fVar = dVar.f444c;
                        if (fVar == null) {
                            j.g("binaryMessenger");
                            throw null;
                        }
                        a1.e eVar = new a1.e(new A0.j(fVar, "xyz.luan/audioplayers/events/".concat(str)));
                        a b3 = a.b(dVar.f);
                        a1.e eVar2 = dVar.f445d;
                        if (eVar2 == null) {
                            j.g("soundPoolManager");
                            throw null;
                        }
                        concurrentHashMap.put(str, new H2.p(dVar, eVar, b3, eVar2));
                        p12.success(1);
                    } else {
                        H2.p pVar = (H2.p) concurrentHashMap.get(str);
                        if (pVar == null) {
                            throw new IllegalStateException("Player has not yet been created or has already been disposed.");
                        }
                        if (str2 != null) {
                            try {
                                int hashCode = str2.hashCode();
                                a1.e eVar3 = pVar.f547b;
                                switch (hashCode) {
                                    case -1757019252:
                                        if (str2.equals("getCurrentPosition")) {
                                            p12.success((!pVar.f557m || (hVar = pVar.f550e) == null) ? null : hVar.n());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -1722943962:
                                        if (str2.equals("setPlayerMode")) {
                                            String str3 = (String) p02.a("playerMode");
                                            e valueOf = str3 == null ? null : e.valueOf(AbstractC0086a.b0((String) AbstractC0292g.a0(m.p0(str3, new char[]{'.'}))));
                                            if (valueOf == null) {
                                                throw new IllegalStateException("playerMode is required");
                                            }
                                            pVar.g(valueOf);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -1660487654:
                                        if (str2.equals("setBalance")) {
                                            Double d3 = (Double) p02.a("balance");
                                            if (d3 == null) {
                                                throw new IllegalStateException("balance is required");
                                            }
                                            float doubleValue = (float) d3.doubleValue();
                                            if (pVar.f552h != doubleValue) {
                                                pVar.f552h = doubleValue;
                                                if (!pVar.f556l && (hVar2 = pVar.f550e) != null) {
                                                    H2.p.j(hVar2, pVar.f551g, doubleValue);
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
                                            String str4 = (String) p02.a("message");
                                            if (str4 == null) {
                                                throw new IllegalStateException("message is required");
                                            }
                                            pVar.c(str4);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case -934426579:
                                        if (str2.equals("resume")) {
                                            if (!pVar.f558n && !pVar.f556l) {
                                                pVar.f558n = true;
                                                if (pVar.f550e == null) {
                                                    h b4 = pVar.b();
                                                    pVar.f550e = b4;
                                                    I2.c cVar = pVar.f;
                                                    if (cVar != null) {
                                                        b4.p(cVar);
                                                        pVar.a(b4);
                                                    }
                                                } else if (pVar.f557m) {
                                                    pVar.f();
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case -402284771:
                                        if (str2.equals("setPlaybackRate")) {
                                            Double d4 = (Double) p02.a("playbackRate");
                                            if (d4 == null) {
                                                throw new IllegalStateException("playbackRate is required");
                                            }
                                            float doubleValue2 = (float) d4.doubleValue();
                                            if (pVar.f553i != doubleValue2) {
                                                pVar.f553i = doubleValue2;
                                                if (pVar.f558n && (hVar3 = pVar.f550e) != null) {
                                                    hVar3.i(doubleValue2);
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case -159032046:
                                        if (str2.equals("setSourceUrl")) {
                                            String str5 = (String) p02.a("url");
                                            if (str5 == null) {
                                                throw new IllegalStateException("url is required");
                                            }
                                            Boolean bool = (Boolean) p02.a("isLocal");
                                            try {
                                                pVar.i(new I2.d(str5, bool != null ? bool.booleanValue() : false));
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
                                            Integer num = (Integer) p02.a("position");
                                            if (num == null) {
                                                throw new IllegalStateException("position is required");
                                            }
                                            int intValue = num.intValue();
                                            if (pVar.f557m && ((hVar4 = pVar.f550e) == null || !hVar4.h())) {
                                                h hVar8 = pVar.f550e;
                                                if (hVar8 != null) {
                                                    hVar8.j(intValue);
                                                }
                                                intValue = -1;
                                            }
                                            pVar.f559o = intValue;
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 3540994:
                                        if (str2.equals("stop")) {
                                            pVar.k();
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 85887754:
                                        if (str2.equals("getDuration")) {
                                            p12.success((!pVar.f557m || (hVar5 = pVar.f550e) == null) ? null : hVar5.g());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 106440182:
                                        if (str2.equals("pause")) {
                                            pVar.d();
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 670514716:
                                        if (str2.equals("setVolume")) {
                                            Double d5 = (Double) p02.a("volume");
                                            if (d5 == null) {
                                                throw new IllegalStateException("volume is required");
                                            }
                                            float doubleValue3 = (float) d5.doubleValue();
                                            if (pVar.f551g != doubleValue3) {
                                                pVar.f551g = doubleValue3;
                                                if (!pVar.f556l && (hVar6 = pVar.f550e) != null) {
                                                    H2.p.j(hVar6, doubleValue3, pVar.f552h);
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
                                            String str6 = (String) p02.a("code");
                                            if (str6 == null) {
                                                throw new IllegalStateException("code is required");
                                            }
                                            String str7 = (String) p02.a("message");
                                            if (str7 == null) {
                                                throw new IllegalStateException("message is required");
                                            }
                                            pVar.f546a.getClass();
                                            eVar3.y(str6, str7, null);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1090594823:
                                        if (str2.equals("release")) {
                                            pVar.e();
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1671767583:
                                        if (str2.equals("dispose")) {
                                            pVar.e();
                                            eVar3.x();
                                            concurrentHashMap.remove(str);
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1771699022:
                                        if (str2.equals("setSourceBytes")) {
                                            byte[] bArr = (byte[]) p02.a("bytes");
                                            if (bArr == null) {
                                                throw new IllegalStateException("bytes are required");
                                            }
                                            pVar.i(new I2.b(bArr));
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1902436987:
                                        if (str2.equals("setAudioContext")) {
                                            pVar.l(AbstractC0086a.b(p02));
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2096116872:
                                        if (str2.equals("setReleaseMode")) {
                                            String str8 = (String) p02.a("releaseMode");
                                            f valueOf2 = str8 == null ? null : f.valueOf(AbstractC0086a.b0((String) AbstractC0292g.a0(m.p0(str8, new char[]{'.'}))));
                                            if (valueOf2 == null) {
                                                throw new IllegalStateException("releaseMode is required");
                                            }
                                            if (pVar.f554j != valueOf2) {
                                                pVar.f554j = valueOf2;
                                                if (!pVar.f556l && (hVar7 = pVar.f550e) != null) {
                                                    hVar7.b(valueOf2 == f.f450b);
                                                }
                                            }
                                            p12.success(1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            } catch (Exception e4) {
                                p12.b("AndroidAudioError", e4.getMessage(), e4);
                            }
                        }
                        p12.a();
                    }
                }
                return c0279i;
            default:
                l p03 = (l) obj;
                n p13 = (n) obj2;
                j.e(p03, "p0");
                j.e(p13, "p1");
                d dVar2 = (d) this.receiver;
                dVar2.getClass();
                String str9 = p03.f1468a;
                if (str9 != null) {
                    switch (str9.hashCode()) {
                        case -1630329231:
                            if (str9.equals("emitLog")) {
                                String str10 = (String) p03.a("message");
                                if (str10 == null) {
                                    throw new IllegalStateException("message is required");
                                }
                                dVar2.b(str10);
                                p13.success(1);
                                return c0279i;
                            }
                            break;
                        case 3237136:
                            if (str9.equals("init")) {
                                ConcurrentHashMap concurrentHashMap2 = dVar2.f446e;
                                Collection<H2.p> values = concurrentHashMap2.values();
                                j.d(values, "<get-values>(...)");
                                for (H2.p pVar2 : values) {
                                    pVar2.e();
                                    pVar2.f547b.x();
                                }
                                concurrentHashMap2.clear();
                                p13.success(1);
                                return c0279i;
                            }
                            break;
                        case 910310901:
                            if (str9.equals("emitError")) {
                                String str11 = (String) p03.a("code");
                                if (str11 == null) {
                                    throw new IllegalStateException("code is required");
                                }
                                String str12 = (String) p03.a("message");
                                if (str12 == null) {
                                    throw new IllegalStateException("message is required");
                                }
                                a1.e eVar4 = dVar2.f442a;
                                if (eVar4 == null) {
                                    j.g("globalEvents");
                                    throw null;
                                }
                                eVar4.y(str11, str12, null);
                                p13.success(1);
                                return c0279i;
                            }
                            break;
                        case 1902436987:
                            if (str9.equals("setAudioContext")) {
                                AudioManager a4 = dVar2.a();
                                a4.setMode(dVar2.f.f);
                                a4.setSpeakerphoneOn(dVar2.f.f434a);
                                dVar2.f = AbstractC0086a.b(p03);
                                p13.success(1);
                                return c0279i;
                            }
                            break;
                    }
                }
                p13.a();
                return c0279i;
        }
    }
}
