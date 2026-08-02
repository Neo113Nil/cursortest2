package U3;

import X3.m;
import X3.v;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import game.betting133.sports1xbet.aqua_network.AquaClubSheet;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaRosterDigest;
import game.betting133.sports1xbet.aqua_network.AquaSignalEnvelope;
import game.betting133.sports1xbet.aqua_network.AquaSportsApiService;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final AquaSportsApiService f5913a;

    /* renamed from: b, reason: collision with root package name */
    public List f5914b;

    public g() {
        AquaSportsApiService live_arg = AquaSportsApiService.Companion.getLive_arg();
        l.f("live_par_Wire", live_arg);
        this.f5913a = live_arg;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0542c abstractC0542c) {
        a aVar;
        int i;
        g gVar;
        List ent_par_ries;
        if (abstractC0542c instanceof a) {
            aVar = (a) abstractC0542c;
            int i5 = aVar.f5890n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f5890n = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f5888l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = aVar.f5890n;
                if (i != 0) {
                    G4.l.N(obj);
                    List list = this.f5914b;
                    if (list != null) {
                        return list;
                    }
                    aVar.f5887k = this;
                    aVar.f5890n = 1;
                    obj = this.f5913a.requestCompmeansetitionShelf(aVar);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                    gVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.f5887k;
                    G4.l.N(obj);
                }
                ent_par_ries = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                if (ent_par_ries == null) {
                    ent_par_ries = v.f6090k;
                }
                gVar.f5914b = ent_par_ries;
                return ent_par_ries;
            }
        }
        aVar = new a(this, abstractC0542c);
        Object obj2 = aVar.f5888l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = aVar.f5890n;
        if (i != 0) {
        }
        ent_par_ries = ((AquaSignalEnvelope) obj2).getEnt_par_ries();
        if (ent_par_ries == null) {
        }
        gVar.f5914b = ent_par_ries;
        return ent_par_ries;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i5, AbstractC0542c abstractC0542c) {
        b bVar;
        int i6;
        if (abstractC0542c instanceof b) {
            bVar = (b) abstractC0542c;
            int i7 = bVar.f5893m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f5893m = i7 - Integer.MIN_VALUE;
                Object obj = bVar.f5891k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i6 = bVar.f5893m;
                v vVar = v.f6090k;
                if (i6 != 0) {
                    G4.l.N(obj);
                    if (i > 0 && String.valueOf(i5).length() >= 4) {
                        bVar.f5893m = 1;
                        obj = this.f5913a.requestSemeansasonBoard(i, i5, bVar);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                    }
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                List ent_par_ries = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                return ent_par_ries != null ? vVar : ent_par_ries;
            }
        }
        bVar = new b(this, abstractC0542c);
        Object obj2 = bVar.f5891k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i6 = bVar.f5893m;
        v vVar2 = v.f6090k;
        if (i6 != 0) {
        }
        List ent_par_ries2 = ((AquaSignalEnvelope) obj2).getEnt_par_ries();
        if (ent_par_ries2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, AbstractC0542c abstractC0542c) {
        c cVar;
        int i5;
        List ent_par_ries;
        if (abstractC0542c instanceof c) {
            cVar = (c) abstractC0542c;
            int i6 = cVar.f5896m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f5896m = i6 - Integer.MIN_VALUE;
                Object obj = cVar.f5894k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i5 = cVar.f5896m;
                if (i5 != 0) {
                    G4.l.N(obj);
                    if (i <= 0) {
                        return null;
                    }
                    cVar.f5896m = 1;
                    obj = this.f5913a.requestCompmeansetitionCard(i, cVar);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                }
                ent_par_ries = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                if (ent_par_ries == null && !ent_par_ries.isEmpty()) {
                    return (AquaCompetitionBundle) ent_par_ries.get(0);
                }
            }
        }
        cVar = new c(this, abstractC0542c);
        Object obj2 = cVar.f5894k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i5 = cVar.f5896m;
        if (i5 != 0) {
        }
        ent_par_ries = ((AquaSignalEnvelope) obj2).getEnt_par_ries();
        return ent_par_ries == null ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, AbstractC0542c abstractC0542c) {
        d dVar;
        int i5;
        g gVar;
        List ent_par_ries;
        AquaMatchTicket aquaMatchTicket;
        AquaMatchTicket aquaMatchTicket2;
        g gVar2;
        Object requestMmeansatchStats;
        AquaSignalEnvelope aquaSignalEnvelope;
        Object requestSmeanshapeCards;
        AquaSignalEnvelope aquaSignalEnvelope2;
        AquaMatchTicket aquaMatchTicket3;
        AquaSignalEnvelope aquaSignalEnvelope3;
        List ent_par_ries2;
        List ent_par_ries3;
        List ent_par_ries4;
        if (abstractC0542c instanceof d) {
            dVar = (d) abstractC0542c;
            int i6 = dVar.f5903q;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f5903q = i6 - Integer.MIN_VALUE;
                Object obj = dVar.f5901o;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i5 = dVar.f5903q;
                if (i5 != 0) {
                    G4.l.N(obj);
                    if (i <= 0) {
                        throw new IllegalArgumentException("Invalid fixture id");
                    }
                    dVar.f5897k = this;
                    dVar.f5900n = i;
                    dVar.f5903q = 1;
                    obj = this.f5913a.requestMmeansatchCard(i, dVar);
                    if (obj != enumC0510a) {
                        gVar = this;
                    }
                    return enumC0510a;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        i = dVar.f5900n;
                        aquaMatchTicket2 = (AquaMatchTicket) dVar.f5898l;
                        gVar2 = (g) dVar.f5897k;
                        G4.l.N(obj);
                        AquaSignalEnvelope aquaSignalEnvelope4 = (AquaSignalEnvelope) obj;
                        AquaSportsApiService aquaSportsApiService = gVar2.f5913a;
                        dVar.f5897k = gVar2;
                        dVar.f5898l = aquaMatchTicket2;
                        dVar.f5899m = aquaSignalEnvelope4;
                        dVar.f5900n = i;
                        dVar.f5903q = 3;
                        requestMmeansatchStats = aquaSportsApiService.requestMmeansatchStats(i, dVar);
                        if (requestMmeansatchStats != enumC0510a) {
                            aquaSignalEnvelope = aquaSignalEnvelope4;
                            obj = requestMmeansatchStats;
                            AquaSignalEnvelope aquaSignalEnvelope5 = (AquaSignalEnvelope) obj;
                            AquaSportsApiService aquaSportsApiService2 = gVar2.f5913a;
                            dVar.f5897k = aquaMatchTicket2;
                            dVar.f5898l = aquaSignalEnvelope;
                            dVar.f5899m = aquaSignalEnvelope5;
                            dVar.f5903q = 4;
                            requestSmeanshapeCards = aquaSportsApiService2.requestSmeanshapeCards(i, dVar);
                            if (requestSmeanshapeCards != enumC0510a) {
                            }
                        }
                        return enumC0510a;
                    }
                    if (i5 != 3) {
                        if (i5 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aquaSignalEnvelope2 = dVar.f5899m;
                        aquaSignalEnvelope3 = (AquaSignalEnvelope) dVar.f5898l;
                        aquaMatchTicket3 = (AquaMatchTicket) dVar.f5897k;
                        G4.l.N(obj);
                        AquaSignalEnvelope aquaSignalEnvelope6 = (AquaSignalEnvelope) obj;
                        ent_par_ries2 = aquaSignalEnvelope3.getEnt_par_ries();
                        List list = v.f6090k;
                        if (ent_par_ries2 == null) {
                            ent_par_ries2 = list;
                        }
                        ent_par_ries3 = aquaSignalEnvelope2.getEnt_par_ries();
                        if (ent_par_ries3 == null) {
                            ent_par_ries3 = list;
                        }
                        ent_par_ries4 = aquaSignalEnvelope6.getEnt_par_ries();
                        if (ent_par_ries4 != null) {
                            list = ent_par_ries4;
                        }
                        return new AquaMatchDigest(aquaMatchTicket3, ent_par_ries2, ent_par_ries3, list);
                    }
                    i = dVar.f5900n;
                    AquaSignalEnvelope aquaSignalEnvelope7 = dVar.f5899m;
                    AquaMatchTicket aquaMatchTicket4 = (AquaMatchTicket) dVar.f5898l;
                    gVar2 = (g) dVar.f5897k;
                    G4.l.N(obj);
                    aquaSignalEnvelope = aquaSignalEnvelope7;
                    aquaMatchTicket2 = aquaMatchTicket4;
                    AquaSignalEnvelope aquaSignalEnvelope52 = (AquaSignalEnvelope) obj;
                    AquaSportsApiService aquaSportsApiService22 = gVar2.f5913a;
                    dVar.f5897k = aquaMatchTicket2;
                    dVar.f5898l = aquaSignalEnvelope;
                    dVar.f5899m = aquaSignalEnvelope52;
                    dVar.f5903q = 4;
                    requestSmeanshapeCards = aquaSportsApiService22.requestSmeanshapeCards(i, dVar);
                    if (requestSmeanshapeCards != enumC0510a) {
                        obj = requestSmeanshapeCards;
                        aquaSignalEnvelope2 = aquaSignalEnvelope52;
                        aquaMatchTicket3 = aquaMatchTicket2;
                        aquaSignalEnvelope3 = aquaSignalEnvelope;
                        AquaSignalEnvelope aquaSignalEnvelope62 = (AquaSignalEnvelope) obj;
                        ent_par_ries2 = aquaSignalEnvelope3.getEnt_par_ries();
                        List list2 = v.f6090k;
                        if (ent_par_ries2 == null) {
                        }
                        ent_par_ries3 = aquaSignalEnvelope2.getEnt_par_ries();
                        if (ent_par_ries3 == null) {
                        }
                        ent_par_ries4 = aquaSignalEnvelope62.getEnt_par_ries();
                        if (ent_par_ries4 != null) {
                        }
                        return new AquaMatchDigest(aquaMatchTicket3, ent_par_ries2, ent_par_ries3, list2);
                    }
                    return enumC0510a;
                }
                i = dVar.f5900n;
                gVar = (g) dVar.f5897k;
                G4.l.N(obj);
                ent_par_ries = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                if (ent_par_ries != null || (aquaMatchTicket = (AquaMatchTicket) m.Z(ent_par_ries)) == null) {
                    throw new IllegalStateException("Fixture not found");
                }
                AquaSportsApiService aquaSportsApiService3 = gVar.f5913a;
                dVar.f5897k = gVar;
                dVar.f5898l = aquaMatchTicket;
                dVar.f5900n = i;
                dVar.f5903q = 2;
                Object requestMameanstchMoments = aquaSportsApiService3.requestMameanstchMoments(i, dVar);
                if (requestMameanstchMoments != enumC0510a) {
                    g gVar3 = gVar;
                    aquaMatchTicket2 = aquaMatchTicket;
                    obj = requestMameanstchMoments;
                    gVar2 = gVar3;
                    AquaSignalEnvelope aquaSignalEnvelope42 = (AquaSignalEnvelope) obj;
                    AquaSportsApiService aquaSportsApiService4 = gVar2.f5913a;
                    dVar.f5897k = gVar2;
                    dVar.f5898l = aquaMatchTicket2;
                    dVar.f5899m = aquaSignalEnvelope42;
                    dVar.f5900n = i;
                    dVar.f5903q = 3;
                    requestMmeansatchStats = aquaSportsApiService4.requestMmeansatchStats(i, dVar);
                    if (requestMmeansatchStats != enumC0510a) {
                    }
                }
                return enumC0510a;
            }
        }
        dVar = new d(this, abstractC0542c);
        Object obj2 = dVar.f5901o;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i5 = dVar.f5903q;
        if (i5 != 0) {
        }
        ent_par_ries = ((AquaSignalEnvelope) obj2).getEnt_par_ries();
        if (ent_par_ries != null) {
        }
        throw new IllegalStateException("Fixture not found");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, int i5, AbstractC0542c abstractC0542c) {
        e eVar;
        int i6;
        List ent_par_ries;
        if (abstractC0542c instanceof e) {
            eVar = (e) abstractC0542c;
            int i7 = eVar.f5906m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f5906m = i7 - Integer.MIN_VALUE;
                Object obj = eVar.f5904k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i6 = eVar.f5906m;
                if (i6 != 0) {
                    G4.l.N(obj);
                    if (i <= 0) {
                        throw new IllegalArgumentException("Invalid player id");
                    }
                    eVar.f5906m = 1;
                    obj = this.f5913a.requestPlmeansayerSheet(i, i5, eVar);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                }
                ent_par_ries = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                if (ent_par_ries != null || ent_par_ries.isEmpty()) {
                    throw new IllegalStateException("Player not found");
                }
                return m.Y(ent_par_ries);
            }
        }
        eVar = new e(this, abstractC0542c);
        Object obj2 = eVar.f5904k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i6 = eVar.f5906m;
        if (i6 != 0) {
        }
        ent_par_ries = ((AquaSignalEnvelope) obj2).getEnt_par_ries();
        if (ent_par_ries != null) {
        }
        throw new IllegalStateException("Player not found");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, int i5, AbstractC0542c abstractC0542c) {
        f fVar;
        int i6;
        g gVar;
        List ent_par_ries;
        AquaClubSheet aquaClubSheet;
        AquaClubSheet aquaClubSheet2;
        List ent_par_ries2;
        if (abstractC0542c instanceof f) {
            fVar = (f) abstractC0542c;
            int i7 = fVar.f5912p;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fVar.f5912p = i7 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.f5910n;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i6 = fVar2.f5912p;
                if (i6 != 0) {
                    G4.l.N(obj);
                    if (i <= 0) {
                        throw new IllegalArgumentException("Invalid team id");
                    }
                    fVar2.f5907k = this;
                    fVar2.f5908l = i;
                    fVar2.f5909m = i5;
                    fVar2.f5912p = 1;
                    obj = this.f5913a.requestCmeanslubSheet(i, fVar2);
                    if (obj != enumC0510a) {
                        gVar = this;
                    }
                    return enumC0510a;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aquaClubSheet2 = (AquaClubSheet) fVar2.f5907k;
                    G4.l.N(obj);
                    ent_par_ries2 = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                    if (ent_par_ries2 == null) {
                        ent_par_ries2 = v.f6090k;
                    }
                    return new AquaRosterDigest(aquaClubSheet2, ent_par_ries2);
                }
                i5 = fVar2.f5909m;
                i = fVar2.f5908l;
                gVar = (g) fVar2.f5907k;
                G4.l.N(obj);
                int i8 = i5;
                ent_par_ries = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                if (ent_par_ries != null || (aquaClubSheet = (AquaClubSheet) m.Z(ent_par_ries)) == null) {
                    throw new IllegalStateException("Team not found");
                }
                AquaSportsApiService aquaSportsApiService = gVar.f5913a;
                fVar2.f5907k = aquaClubSheet;
                fVar2.f5912p = 2;
                obj = AquaSportsApiService.DefaultImpls.requestCmeanslubRoster$default(aquaSportsApiService, i, i8, 0, fVar2, 4, null);
                if (obj != enumC0510a) {
                    aquaClubSheet2 = aquaClubSheet;
                    ent_par_ries2 = ((AquaSignalEnvelope) obj).getEnt_par_ries();
                    if (ent_par_ries2 == null) {
                    }
                    return new AquaRosterDigest(aquaClubSheet2, ent_par_ries2);
                }
                return enumC0510a;
            }
        }
        fVar = new f(this, abstractC0542c);
        f fVar22 = fVar;
        Object obj2 = fVar22.f5910n;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i6 = fVar22.f5912p;
        if (i6 != 0) {
        }
        int i82 = i5;
        ent_par_ries = ((AquaSignalEnvelope) obj2).getEnt_par_ries();
        if (ent_par_ries != null) {
        }
        throw new IllegalStateException("Team not found");
    }
}
