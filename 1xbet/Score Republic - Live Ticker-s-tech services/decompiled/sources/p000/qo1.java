package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 extends k62 {

    /* JADX INFO: renamed from: m */
    public String f6549m;

    /* JADX INFO: renamed from: n */
    public HashSet f6550n;

    /* JADX INFO: renamed from: o */
    public C0089c8 f6551o;

    /* JADX INFO: renamed from: p */
    public Long f6552p;

    /* JADX INFO: renamed from: q */
    public Long f6553q;

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x0466  */
    /* JADX WARN: Code duplicated, block: B:196:0x0486  */
    /* JADX WARN: Code duplicated, block: B:202:0x049d  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x051d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0532  */
    /* JADX WARN: Code duplicated, block: B:230:0x0554  */
    /* JADX WARN: Code duplicated, block: B:231:0x0558  */
    /* JADX WARN: Code duplicated, block: B:236:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0590  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x05be  */
    /* JADX WARN: Code duplicated, block: B:255:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:262:0x060d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0621  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:275:0x0695  */
    /* JADX WARN: Code duplicated, block: B:282:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f9 A[LOOP:3: B:276:0x0697->B:299:0x06f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:315:0x072c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0737  */
    /* JADX WARN: Code duplicated, block: B:322:0x073b  */
    /* JADX WARN: Code duplicated, block: B:326:0x074d  */
    /* JADX WARN: Code duplicated, block: B:332:0x077c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x07bf A[LOOP:5: B:330:0x0776->B:339:0x07bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:352:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:354:0x0810  */
    /* JADX WARN: Code duplicated, block: B:358:0x084b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0873  */
    /* JADX WARN: Code duplicated, block: B:371:0x0884  */
    /* JADX WARN: Code duplicated, block: B:382:0x08b3 A[LOOP:7: B:359:0x084d->B:382:0x08b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:400:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:410:0x090c  */
    /* JADX WARN: Code duplicated, block: B:414:0x092d  */
    /* JADX WARN: Code duplicated, block: B:417:0x093e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0955  */
    /* JADX WARN: Code duplicated, block: B:421:0x0963  */
    /* JADX WARN: Code duplicated, block: B:423:0x096e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0999  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a2a A[PHI: r16 r20 r21
      0x0a2a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r20v5 w71) = (r20v6 w71), (r2v41 w71) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
      0x0a2a: PHI (r21v20 java.util.Iterator) = (r21v21 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:536:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06f4 A[EDGE_INSN: B:542:0x06f4->B:298:0x06f4 BREAK  A[LOOP:3: B:276:0x0697->B:299:0x06f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08ae A[EDGE_INSN: B:553:0x08ae->B:381:0x08ae BREAK  A[LOOP:7: B:359:0x084d->B:382:0x08b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x091e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v31, types: [c8, w71] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [c8, w71] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [f02] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [f02] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [wc1] */
    /* JADX WARN: Type inference failed for: r3v83, types: [wc1] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: E */
    public final ArrayList m4120E(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        f02 f02Var;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        m02 m02Var;
        BitSet bitSet;
        BitSet bitSet2;
        C0089c8 c0089c8;
        m02 m02Var2;
        C0089c8 c0089c9;
        List<vw1> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        p02 p02Var;
        Long lValueOf;
        qt1 qt1VarM5564h0;
        String str6;
        ?? c0089c10;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        C0089c8 c0089c11;
        Iterator it2;
        Integer num;
        m02 m02Var3;
        List list4;
        ?? r18;
        Iterator it3;
        f02 f02Var2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        qt1 qt1VarM5564h1;
        f02 f02Var3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        w71 w71Var;
        String strM4643v;
        Map map6;
        Iterator it5;
        Iterator it6;
        w71 w71Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zM4116b;
        w71 w71Var3;
        Map map7;
        ex1 ex1Var;
        Integer numValueOf3;
        qm1 qm1Var;
        int i2;
        Integer numValueOf4;
        f02 f02Var4;
        String str9;
        C0089c8 c0089c12;
        Cursor cursor;
        f02 f02Var5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        ob2 ob2Var;
        ?? c0089c13;
        rz1 rz1VarM3667a;
        du1 du1VarM4185k0;
        long j;
        String strM4464y;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zM4115a;
        Map map9;
        ob2 ob2Var2;
        Integer num3;
        qm1 qm1Var2;
        int iM5211u;
        wa2 wa2Var;
        boolean z5;
        String str11;
        C0089c8 c0089c14;
        ?? r8;
        String str12;
        ?? r2;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        C0089c8 c0089c15;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        f02 f02Var6 = (f02) this.f7192j;
        p80.m3860e(str);
        p80.m3863h(list);
        p80.m3863h(list2);
        this.f6549m = str;
        this.f6550n = new HashSet();
        this.f6551o = new C0089c8();
        this.f6552p = l;
        this.f6553q = l2;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((rz1) it9.next()).m4464y())) {
                z2 = true;
                break;
            }
        }
        sr1.m4588a();
        boolean zM770L = f02Var6.f2245m.m770L(this.f6549m, jx1.f4123F0);
        sr1.m4588a();
        boolean zM770L2 = f02Var6.f2245m.m770L(this.f6549m, jx1.f4121E0);
        x62 x62Var = this.f1566k;
        if (z2) {
            qt1 qt1VarM5564h2 = x62Var.m5564h0();
            String str13 = this.f6549m;
            qt1VarM5564h2.m2988B();
            qt1VarM5564h2.mo11z();
            p80.m3860e(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                qt1VarM5564h2.m4191r0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((f02) qt1VarM5564h2.f7192j).mo1563b().m3109E().m5314c(ky1.m3106I(str13), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objM3106I = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zM770L2 && zM770L) {
                        qt1 qt1VarM5564h3 = x62Var.m5564h0();
                        f02 f02Var7 = (f02) qt1VarM5564h3.f7192j;
                        String str16 = this.f6549m;
                        p80.m3860e(str16);
                        z3 = z2;
                        C0089c8 c0089c16 = new C0089c8();
                        try {
                            ?? Query2 = qt1VarM5564h3.m4191r0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    vw1 vw1Var = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query2.getBlob(1))).m5683d();
                                                    if (vw1Var.m5216z()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) c0089c16.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            c0089c16.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(vw1Var);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    f02Var7.mo1563b().m3109E().m5314c(ky1.m3106I(str16), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        f02Var7.mo1563b().m3109E().m5314c(ky1.m3106I(str16), e, "Database error querying filters. appId");
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                f02Var7.mo1563b().m3109E().m5314c(ky1.m3106I(str16), e, "Database error querying filters. appId");
                                                map10 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map10;
                                                qt1 qt1VarM5564h4 = x62Var.m5564h0();
                                                obj = (f02) qt1VarM5564h4.f7192j;
                                                r5 = this.f6549m;
                                                qt1VarM5564h4.m2988B();
                                                qt1VarM5564h4.mo11z();
                                                p80.m3860e(r5);
                                                cursorQuery = qt1VarM5564h4.m4191r0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    c0089c15 = new C0089c8();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                m02 m02Var4 = (m02) ((l02) a72.m58l0(m02.m3296B(), cursorQuery.getBlob(1))).m5683d();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                c0089c15.put(objValueOf, m02Var4);
                                                                str3 = str14;
                                                                obj2 = objM3106I;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                wc1 wc1VarM3109E = r17.mo1563b().m3109E();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objM3106I;
                                                                try {
                                                                    objM3106I = ky1.m3106I(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    wc1VarM3109E.m5315d("Failed to merge filter results. appId, audienceId, error", objM3106I, numValueOf8, e5);
                                                                    obj3 = wc1VarM3109E;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.mo1563b().m3109E().m5314c(ky1.m3106I(r21), e, "Database error querying filter results. appId");
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        f02Var = f02Var6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.f6549m;
                                                                            qt1VarM5564h0 = x62Var.m5564h0();
                                                                            str6 = this.f6549m;
                                                                            qt1VarM5564h0.m2988B();
                                                                            qt1VarM5564h0.mo11z();
                                                                            p80.m3860e(str6);
                                                                            c0089c10 = new C0089c8();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = qt1VarM5564h0.m4191r0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) c0089c10.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    c0089c10.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            c0089c10 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((f02) qt1VarM5564h0.f7192j).mo1563b().m3109E().m5314c(ky1.m3106I(str6), e, "Database error querying scoped filters. appId");
                                                                                        c0089c10 = Collections.EMPTY_MAP;
                                                                                        r0 = c0089c10;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        p80.m3860e(str17);
                                                                                        c0089c11 = new C0089c8();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                m02Var3 = (m02) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                f02Var2 = f02Var6;
                                                                                                c0089c11.put(num, m02Var3);
                                                                                                r0 = r18;
                                                                                                str15 = str15;
                                                                                                it2 = it3;
                                                                                                f02Var6 = f02Var2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        f02Var = f02Var6;
                                                                                        map3 = c0089c11;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            m02Var = (m02) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            c0089c8 = new C0089c8();
                                                                                            if (m02Var != null) {
                                                                                                for (pz1 pz1Var : m02Var.m3311x()) {
                                                                                                    if (pz1Var.m4016t()) {
                                                                                                        m02 m02Var5 = m02Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(pz1Var.m4017u());
                                                                                                        if (pz1Var.m4018v()) {
                                                                                                            lValueOf = Long.valueOf(pz1Var.m4019w());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        c0089c8.put(numValueOf9, lValueOf);
                                                                                                        m02Var = m02Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            m02Var2 = m02Var;
                                                                                            c0089c9 = new C0089c8();
                                                                                            if (m02Var2 != null) {
                                                                                                it = m02Var2.m3313z().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    p02Var = (p02) it.next();
                                                                                                    if (!p02Var.m3825t()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (m02Var2 != null) {
                                                                                                i = 0;
                                                                                                while (i < m02Var2.m3308u() * 64) {
                                                                                                    if (a72.m56f0((jp1) m02Var2.m3307t(), i)) {
                                                                                                        z4 = zM770L;
                                                                                                        f02Var.mo1563b().m3112H().m5314c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (a72.m56f0((jp1) m02Var2.m3309v(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zM770L = z4;
                                                                                                    } else {
                                                                                                        z4 = zM770L;
                                                                                                    }
                                                                                                    c0089c8.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zM770L = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zM770L;
                                                                                            m02 m02Var6 = (m02) map4.get(num4);
                                                                                            if (zM770L2) {
                                                                                                for (vw1 vw1Var2 : list3) {
                                                                                                    int iM5211u2 = vw1Var2.m5211u();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.f6553q.longValue() / 1000;
                                                                                                    if (vw1Var2.m5205C()) {
                                                                                                        jLongValue = this.f6552p.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iM5211u2);
                                                                                                    if (c0089c8.containsKey(numValueOf)) {
                                                                                                        c0089c8.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (c0089c9.containsKey(numValueOf)) {
                                                                                                        c0089c9.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f6551o.put(num4, new wa2(this, this.f6549m, m02Var6, bitSet, bitSet2, c0089c8, c0089c9));
                                                                                            map = map;
                                                                                            zM770L = z6;
                                                                                            map4 = map4;
                                                                                            zM770L2 = zM770L2;
                                                                                            str3 = str3;
                                                                                            map5 = map12;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r10 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            ob2Var = new ob2(this);
                                                                                            c0089c13 = new C0089c8();
                                                                                            for (rz1 rz1Var : list) {
                                                                                                rz1VarM3667a = ob2Var.m3667a(this.f6549m, rz1Var);
                                                                                                if (rz1VarM3667a != null) {
                                                                                                    du1VarM4185k0 = x62Var.m5564h0().m4185k0(this.f6549m, rz1Var, rz1VarM3667a.m4464y());
                                                                                                    x62Var.m5564h0().m4177b0("events", du1VarM4185k0);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = du1VarM4185k0.f1831c;
                                                                                                        strM4464y = rz1VarM3667a.m4464y();
                                                                                                        map8 = (Map) c0089c13.get(strM4464y);
                                                                                                        if (map8 == null) {
                                                                                                            qt1 qt1VarM5564h5 = x62Var.m5564h0();
                                                                                                            f02 f02Var8 = (f02) qt1VarM5564h5.f7192j;
                                                                                                            str11 = this.f6549m;
                                                                                                            qt1VarM5564h5.m2988B();
                                                                                                            qt1VarM5564h5.mo11z();
                                                                                                            p80.m3860e(str11);
                                                                                                            p80.m3860e(strM4464y);
                                                                                                            c0089c14 = new C0089c8();
                                                                                                            try {
                                                                                                                Query = qt1VarM5564h5.m4191r0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM4464y}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        vw1 vw1Var3 = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query.getBlob(1))).m5683d();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) c0089c14.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                c0089c14.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r45 = r46;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    f02Var8.mo1563b().m3109E().m5314c(ky1.m3106I(str12), e, r10);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r8 = r44;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(vw1Var3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r47 = Query;
                                                                                                                                        f02Var8.mo1563b().m3109E().m5314c(ky1.m3106I(str12), e9, str18);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r45 = Query;
                                                                                                                                    r2 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    f02Var8.mo1563b().m3109E().m5314c(ky1.m3106I(str12), e, r10);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    c0089c13.put(strM4464y, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.f6550n.contains(num6)) {
                                                                                                                                            f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zM4115a = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    ob2Var2 = ob2Var;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                vw1 vw1Var4 = (vw1) it8.next();
                                                                                                                                                ob2Var2 = ob2Var;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var4, 0);
                                                                                                                                                Long l3 = this.f6552p;
                                                                                                                                                Long l4 = this.f6553q;
                                                                                                                                                iM5211u = vw1Var4.m5211u();
                                                                                                                                                wa2Var = (wa2) this.f6551o.get(num3);
                                                                                                                                                if (wa2Var == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = wa2Var.f8489d.get(iM5211u);
                                                                                                                                                }
                                                                                                                                                zM4115a = qm1Var2.m4115a(l3, l4, rz1VarM3667a, j, du1VarM4185k0, z5);
                                                                                                                                                if (!zM4115a) {
                                                                                                                                                    this.f6550n.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                m4121F(num3).m5309a(qm1Var2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                ob2Var = ob2Var2;
                                                                                                                                            }
                                                                                                                                            if (!zM4115a) {
                                                                                                                                                this.f6550n.add(num3);
                                                                                                                                            }
                                                                                                                                            ob2Var = ob2Var2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = c0089c14;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e11) {
                                                                                                                        e = e11;
                                                                                                                        str12 = str11;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    r44 = Query;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                r2 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            c0089c13.put(strM4464y, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.f6550n.contains(num6)) {
                                                                                                                f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zM4115a = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        ob2Var2 = ob2Var;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    vw1 vw1Var5 = (vw1) it8.next();
                                                                                                                    ob2Var2 = ob2Var;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var5, 0);
                                                                                                                    Long l5 = this.f6552p;
                                                                                                                    Long l6 = this.f6553q;
                                                                                                                    iM5211u = vw1Var5.m5211u();
                                                                                                                    wa2Var = (wa2) this.f6551o.get(num3);
                                                                                                                    if (wa2Var == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = wa2Var.f8489d.get(iM5211u);
                                                                                                                    }
                                                                                                                    zM4115a = qm1Var2.m4115a(l5, l6, rz1VarM3667a, j, du1VarM4185k0, z5);
                                                                                                                    if (!zM4115a) {
                                                                                                                        this.f6550n.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    m4121F(num3).m5309a(qm1Var2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    ob2Var = ob2Var2;
                                                                                                                }
                                                                                                                if (!zM4115a) {
                                                                                                                    this.f6550n.add(num3);
                                                                                                                }
                                                                                                                ob2Var = ob2Var2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            C0089c8 c0089c17 = new C0089c8();
                                                                                            it4 = list2.iterator();
                                                                                            w71Var = c0089c17;
                                                                                            while (it4.hasNext()) {
                                                                                                t02 t02Var = (t02) it4.next();
                                                                                                strM4643v = t02Var.m4643v();
                                                                                                map6 = (Map) w71Var.get(strM4643v);
                                                                                                if (map6 == null) {
                                                                                                    qt1 qt1VarM5564h6 = x62Var.m5564h0();
                                                                                                    f02Var4 = (f02) qt1VarM5564h6.f7192j;
                                                                                                    str9 = this.f6549m;
                                                                                                    qt1VarM5564h6.m2988B();
                                                                                                    qt1VarM5564h6.mo11z();
                                                                                                    p80.m3860e(str9);
                                                                                                    p80.m3860e(strM4643v);
                                                                                                    c0089c12 = new C0089c8();
                                                                                                    try {
                                                                                                        cursorQuery2 = qt1VarM5564h6.m4191r0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM4643v}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                ex1 ex1Var2 = (ex1) ((cx1) a72.m58l0(ex1.m1508B(), cursorQuery2.getBlob(1))).m5683d();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) c0089c12.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    f02Var5 = f02Var4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        c0089c12.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            f02Var5.mo1563b().m3109E().m5314c(ky1.m3106I(str10), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            w71Var.put(strM4643v, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            w71Var2 = w71Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.f6550n.contains(num2)) {
                                                                                                                                                    f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zM4116b = true;
                                                                                                                                                w71Var3 = w71Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        ex1Var = (ex1) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                                                                                                                            wc1 wc1VarM3112H = f02Var.mo1563b().m3112H();
                                                                                                                                                            if (ex1Var.m1511t()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            wc1VarM3112H.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                                                                                                                            f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (ex1Var.m1511t()) {
                                                                                                                                                        }
                                                                                                                                                        wc1 wc1VarM3110F = f02Var.mo1563b().m3110F();
                                                                                                                                                        iy1 iy1VarM3106I = ky1.m3106I(this.f6549m);
                                                                                                                                                        if (ex1Var.m1511t()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        wc1VarM3110F.m5314c(iy1VarM3106I, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.f6550n.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        w71Var2 = w71Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        w71Var3 = w71Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zM4116b) {
                                                                                                                                                        this.f6550n.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    w71Var2 = w71Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    m4121F(num2).m5309a(qm1Var);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    w71Var3 = w71Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            w71Var = w71Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    f02Var5 = f02Var4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(ex1Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                f02Var5 = f02Var4;
                                                                                                                                str10 = str9;
                                                                                                                                f02Var5.mo1563b().m3109E().m5314c(ky1.m3106I(str10), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                f02Var4 = f02Var5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                f02Var5.mo1563b().m3109E().m5314c(ky1.m3106I(str10), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            f02Var5 = f02Var4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            f02Var5.mo1563b().m3109E().m5314c(ky1.m3106I(str10), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            w71Var.put(strM4643v, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            w71Var2 = w71Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.f6550n.contains(num2)) {
                                                                                                                                    f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zM4116b = true;
                                                                                                                                w71Var3 = w71Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        ex1Var = (ex1) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                                                                                                            wc1 wc1VarM3112H2 = f02Var.mo1563b().m3112H();
                                                                                                                                            if (ex1Var.m1511t()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            wc1VarM3112H2.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                                                                                                            f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (ex1Var.m1511t()) {
                                                                                                                                        }
                                                                                                                                        wc1 wc1VarM3110F2 = f02Var.mo1563b().m3110F();
                                                                                                                                        iy1 iy1VarM3106I2 = ky1.m3106I(this.f6549m);
                                                                                                                                        if (ex1Var.m1511t()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        wc1VarM3110F2.m5314c(iy1VarM3106I2, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.f6550n.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        w71Var2 = w71Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        w71Var3 = w71Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zM4116b) {
                                                                                                                                        this.f6550n.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    w71Var2 = w71Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    m4121F(num2).m5309a(qm1Var);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    w71Var3 = w71Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            w71Var = w71Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = c0089c12;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th8) {
                                                                                                                th = th8;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e17) {
                                                                                                            e = e17;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        f02Var5 = f02Var4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    w71Var.put(strM4643v, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                w71Var2 = w71Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.f6550n.contains(num2)) {
                                                                                                        f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zM4116b = true;
                                                                                                    w71Var3 = w71Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            ex1Var = (ex1) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                                                                                wc1 wc1VarM3112H3 = f02Var.mo1563b().m3112H();
                                                                                                                if (ex1Var.m1511t()) {
                                                                                                                    numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                wc1VarM3112H3.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                                                                                f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                                                                                            }
                                                                                                            if (ex1Var.m1511t()) {
                                                                                                            }
                                                                                                            wc1 wc1VarM3110F3 = f02Var.mo1563b().m3110F();
                                                                                                            iy1 iy1VarM3106I3 = ky1.m3106I(this.f6549m);
                                                                                                            if (ex1Var.m1511t()) {
                                                                                                                numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            wc1VarM3110F3.m5314c(iy1VarM3106I3, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.f6550n.add(num2);
                                                                                                            map6 = map7;
                                                                                                            w71Var2 = w71Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            w71Var3 = w71Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zM4116b) {
                                                                                                            this.f6550n.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        w71Var2 = w71Var3;
                                                                                                        it6 = it6;
                                                                                                        m4121F(num2).m5309a(qm1Var);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        w71Var3 = w71Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                w71Var = w71Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        C0941z7<Integer> c0941z7 = (C0941z7) this.f6551o.keySet();
                                                                                        c0941z7.removeAll(this.f6550n);
                                                                                        for (Integer num7 : c0941z7) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            wa2 wa2Var2 = (wa2) this.f6551o.get(num7);
                                                                                            p80.m3863h(wa2Var2);
                                                                                            ez1 ez1VarM5310b = wa2Var2.m5310b(iIntValue3);
                                                                                            arrayList2.add(ez1VarM5310b);
                                                                                            qt1VarM5564h1 = x62Var.m5564h0();
                                                                                            f02Var3 = (f02) qt1VarM5564h1.f7192j;
                                                                                            str8 = this.f6549m;
                                                                                            m02 m02VarM1535v = ez1VarM5310b.m1535v();
                                                                                            qt1VarM5564h1.m2988B();
                                                                                            qt1VarM5564h1.mo11z();
                                                                                            p80.m3860e(str8);
                                                                                            p80.m3863h(m02VarM1535v);
                                                                                            byte[] bArrM1274a = m02VarM1535v.m1274a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrM1274a);
                                                                                            try {
                                                                                                try {
                                                                                                    if (qt1VarM5564h1.m4191r0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        f02Var3.mo1563b().m3109E().m5313b(ky1.m3106I(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    f02Var3.mo1563b().m3109E().m5314c(ky1.m3106I(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = c0089c10;
                                                                                p80.m3860e(str17);
                                                                                c0089c11 = new C0089c8();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        m02Var3 = (m02) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        f02Var2 = f02Var6;
                                                                                        c0089c11.put(num, m02Var3);
                                                                                        r0 = r18;
                                                                                        str15 = str15;
                                                                                        it2 = it3;
                                                                                        f02Var6 = f02Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                f02Var = f02Var6;
                                                                                map3 = c0089c11;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            f02Var = f02Var6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            m02Var = (m02) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            c0089c8 = new C0089c8();
                                                                            if (m02Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (pz1Var.m4016t()) {
                                                                                        m02 m02Var7 = m02Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(pz1Var.m4017u());
                                                                                        if (pz1Var.m4018v()) {
                                                                                            lValueOf = Long.valueOf(pz1Var.m4019w());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        c0089c8.put(numValueOf10, lValueOf);
                                                                                        m02Var = m02Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            m02Var2 = m02Var;
                                                                            c0089c9 = new C0089c8();
                                                                            if (m02Var2 != null) {
                                                                                it = m02Var2.m3313z().iterator();
                                                                                while (it.hasNext()) {
                                                                                    p02Var = (p02) it.next();
                                                                                    if (!p02Var.m3825t()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (m02Var2 != null) {
                                                                                i = 0;
                                                                                while (i < m02Var2.m3308u() * 64) {
                                                                                    if (a72.m56f0((jp1) m02Var2.m3307t(), i)) {
                                                                                        z4 = zM770L;
                                                                                        f02Var.mo1563b().m3112H().m5314c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (a72.m56f0((jp1) m02Var2.m3309v(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zM770L = z4;
                                                                                    } else {
                                                                                        z4 = zM770L;
                                                                                    }
                                                                                    c0089c8.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zM770L = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zM770L;
                                                                            m02 m02Var8 = (m02) map4.get(num4);
                                                                            if (zM770L2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iM5211u3 = vw1Var2.m5211u();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.f6553q.longValue() / 1000;
                                                                                    if (vw1Var2.m5205C()) {
                                                                                        jLongValue = this.f6552p.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iM5211u3);
                                                                                    if (c0089c8.containsKey(numValueOf)) {
                                                                                        c0089c8.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (c0089c9.containsKey(numValueOf)) {
                                                                                        c0089c9.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f6551o.put(num4, new wa2(this, this.f6549m, m02Var8, bitSet, bitSet2, c0089c8, c0089c9));
                                                                            map = map;
                                                                            zM770L = z7;
                                                                            map4 = map4;
                                                                            zM770L2 = zM770L2;
                                                                            str3 = str3;
                                                                            map5 = map13;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r11 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        ob2Var = new ob2(this);
                                                                        c0089c13 = new C0089c8();
                                                                        while (r17.hasNext()) {
                                                                            rz1VarM3667a = ob2Var.m3667a(this.f6549m, rz1Var);
                                                                            if (rz1VarM3667a != null) {
                                                                                du1VarM4185k0 = x62Var.m5564h0().m4185k0(this.f6549m, rz1Var, rz1VarM3667a.m4464y());
                                                                                x62Var.m5564h0().m4177b0("events", du1VarM4185k0);
                                                                                if (z) {
                                                                                    j = du1VarM4185k0.f1831c;
                                                                                    strM4464y = rz1VarM3667a.m4464y();
                                                                                    map8 = (Map) c0089c13.get(strM4464y);
                                                                                    if (map8 == null) {
                                                                                        qt1 qt1VarM5564h7 = x62Var.m5564h0();
                                                                                        f02 f02Var9 = (f02) qt1VarM5564h7.f7192j;
                                                                                        str11 = this.f6549m;
                                                                                        qt1VarM5564h7.m2988B();
                                                                                        qt1VarM5564h7.mo11z();
                                                                                        p80.m3860e(str11);
                                                                                        p80.m3860e(strM4464y);
                                                                                        c0089c14 = new C0089c8();
                                                                                        Query = qt1VarM5564h7.m4191r0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM4464y}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                vw1 vw1Var6 = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query.getBlob(1))).m5683d();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) c0089c14.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    c0089c14.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(vw1Var6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = c0089c14;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        c0089c13.put(strM4464y, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.f6550n.contains(num6)) {
                                                                                            f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zM4115a = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    ob2Var2 = ob2Var;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                vw1 vw1Var7 = (vw1) it8.next();
                                                                                                ob2Var2 = ob2Var;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var7, 0);
                                                                                                Long l7 = this.f6552p;
                                                                                                Long l8 = this.f6553q;
                                                                                                iM5211u = vw1Var7.m5211u();
                                                                                                wa2Var = (wa2) this.f6551o.get(num3);
                                                                                                if (wa2Var == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = wa2Var.f8489d.get(iM5211u);
                                                                                                }
                                                                                                zM4115a = qm1Var2.m4115a(l7, l8, rz1VarM3667a, j, du1VarM4185k0, z5);
                                                                                                if (!zM4115a) {
                                                                                                    this.f6550n.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                m4121F(num3).m5309a(qm1Var2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                ob2Var = ob2Var2;
                                                                                            }
                                                                                            if (!zM4115a) {
                                                                                                this.f6550n.add(num3);
                                                                                            }
                                                                                            ob2Var = ob2Var2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        C0089c8 c0089c18 = new C0089c8();
                                                                        it4 = list2.iterator();
                                                                        w71Var = c0089c18;
                                                                        while (it4.hasNext()) {
                                                                            t02 t02Var2 = (t02) it4.next();
                                                                            strM4643v = t02Var2.m4643v();
                                                                            map6 = (Map) w71Var.get(strM4643v);
                                                                            if (map6 == null) {
                                                                                qt1 qt1VarM5564h8 = x62Var.m5564h0();
                                                                                f02Var4 = (f02) qt1VarM5564h8.f7192j;
                                                                                str9 = this.f6549m;
                                                                                qt1VarM5564h8.m2988B();
                                                                                qt1VarM5564h8.mo11z();
                                                                                p80.m3860e(str9);
                                                                                p80.m3860e(strM4643v);
                                                                                c0089c12 = new C0089c8();
                                                                                cursorQuery2 = qt1VarM5564h8.m4191r0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM4643v}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        ex1 ex1Var3 = (ex1) ((cx1) a72.m58l0(ex1.m1508B(), cursorQuery2.getBlob(1))).m5683d();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) c0089c12.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            f02Var5 = f02Var4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            c0089c12.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            f02Var5 = f02Var4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(ex1Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        f02Var4 = f02Var5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = c0089c12;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                w71Var.put(strM4643v, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            w71Var2 = w71Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f6550n.contains(num2)) {
                                                                                    f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zM4116b = true;
                                                                                w71Var3 = w71Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        ex1Var = (ex1) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                                                            wc1 wc1VarM3112H4 = f02Var.mo1563b().m3112H();
                                                                                            if (ex1Var.m1511t()) {
                                                                                                numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            wc1VarM3112H4.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                                                            f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                                                                        }
                                                                                        if (ex1Var.m1511t()) {
                                                                                        }
                                                                                        wc1 wc1VarM3110F4 = f02Var.mo1563b().m3110F();
                                                                                        iy1 iy1VarM3106I4 = ky1.m3106I(this.f6549m);
                                                                                        if (ex1Var.m1511t()) {
                                                                                            numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        wc1VarM3110F4.m5314c(iy1VarM3106I4, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.f6550n.add(num2);
                                                                                        map6 = map7;
                                                                                        w71Var2 = w71Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        w71Var3 = w71Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zM4116b) {
                                                                                        this.f6550n.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    w71Var2 = w71Var3;
                                                                                    it6 = it6;
                                                                                    m4121F(num2).m5309a(qm1Var);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    w71Var3 = w71Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            w71Var = w71Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    C0941z7<Integer> c0941z8 = (C0941z7) this.f6551o.keySet();
                                                                    c0941z8.removeAll(this.f6550n);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        wa2 wa2Var3 = (wa2) this.f6551o.get(num7);
                                                                        p80.m3863h(wa2Var3);
                                                                        ez1 ez1VarM5310b2 = wa2Var3.m5310b(iIntValue4);
                                                                        arrayList2.add(ez1VarM5310b2);
                                                                        qt1VarM5564h1 = x62Var.m5564h0();
                                                                        f02Var3 = (f02) qt1VarM5564h1.f7192j;
                                                                        str8 = this.f6549m;
                                                                        m02 m02VarM1535v2 = ez1VarM5310b2.m1535v();
                                                                        qt1VarM5564h1.m2988B();
                                                                        qt1VarM5564h1.mo11z();
                                                                        p80.m3860e(str8);
                                                                        p80.m3863h(m02VarM1535v2);
                                                                        byte[] bArrM1274a2 = m02VarM1535v2.m1274a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrM1274a2);
                                                                        if (qt1VarM5564h1.m4191r0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            f02Var3.mo1563b().m3109E().m5313b(ky1.m3106I(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objM3106I = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.mo1563b().m3109E().m5314c(ky1.m3106I(r21), e, "Database error querying filter results. appId");
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objM3106I;
                                                            r21 = r21;
                                                            r17.mo1563b().m3109E().m5314c(ky1.m3106I(r21), e, "Database error querying filter results. appId");
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                f02Var = f02Var6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.f6549m;
                                                                    qt1VarM5564h0 = x62Var.m5564h0();
                                                                    str6 = this.f6549m;
                                                                    qt1VarM5564h0.m2988B();
                                                                    qt1VarM5564h0.mo11z();
                                                                    p80.m3860e(str6);
                                                                    c0089c10 = new C0089c8();
                                                                    cursorRawQuery = qt1VarM5564h0.m4191r0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c0089c10.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c0089c10.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c0089c10 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = c0089c10;
                                                                    p80.m3860e(str110);
                                                                    c0089c11 = new C0089c8();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            m02Var3 = (m02) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            f02Var2 = f02Var6;
                                                                            c0089c11.put(num, m02Var3);
                                                                            r0 = r18;
                                                                            str15 = str15;
                                                                            it2 = it3;
                                                                            f02Var6 = f02Var2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    f02Var = f02Var6;
                                                                    map3 = c0089c11;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    f02Var = f02Var6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    m02Var = (m02) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    c0089c8 = new C0089c8();
                                                                    if (m02Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (pz1Var.m4016t()) {
                                                                                m02 m02Var9 = m02Var;
                                                                                Integer numValueOf11 = Integer.valueOf(pz1Var.m4017u());
                                                                                if (pz1Var.m4018v()) {
                                                                                    lValueOf = Long.valueOf(pz1Var.m4019w());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                c0089c8.put(numValueOf11, lValueOf);
                                                                                m02Var = m02Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    m02Var2 = m02Var;
                                                                    c0089c9 = new C0089c8();
                                                                    if (m02Var2 != null) {
                                                                        it = m02Var2.m3313z().iterator();
                                                                        while (it.hasNext()) {
                                                                            p02Var = (p02) it.next();
                                                                            if (!p02Var.m3825t()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (m02Var2 != null) {
                                                                        i = 0;
                                                                        while (i < m02Var2.m3308u() * 64) {
                                                                            if (a72.m56f0((jp1) m02Var2.m3307t(), i)) {
                                                                                z4 = zM770L;
                                                                                f02Var.mo1563b().m3112H().m5314c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (a72.m56f0((jp1) m02Var2.m3309v(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zM770L = z4;
                                                                            } else {
                                                                                z4 = zM770L;
                                                                            }
                                                                            c0089c8.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zM770L = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zM770L;
                                                                    m02 m02Var10 = (m02) map4.get(num4);
                                                                    if (zM770L2) {
                                                                        while (r2.hasNext()) {
                                                                            int iM5211u4 = vw1Var2.m5211u();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.f6553q.longValue() / 1000;
                                                                            if (vw1Var2.m5205C()) {
                                                                                jLongValue = this.f6552p.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iM5211u4);
                                                                            if (c0089c8.containsKey(numValueOf)) {
                                                                                c0089c8.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (c0089c9.containsKey(numValueOf)) {
                                                                                c0089c9.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f6551o.put(num4, new wa2(this, this.f6549m, m02Var10, bitSet, bitSet2, c0089c8, c0089c9));
                                                                    map = map;
                                                                    zM770L = z8;
                                                                    map4 = map4;
                                                                    zM770L2 = zM770L2;
                                                                    str3 = str3;
                                                                    map5 = map16;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r12 = obj2;
                                                            if (!list.isEmpty()) {
                                                                ob2Var = new ob2(this);
                                                                c0089c13 = new C0089c8();
                                                                while (r17.hasNext()) {
                                                                    rz1VarM3667a = ob2Var.m3667a(this.f6549m, rz1Var);
                                                                    if (rz1VarM3667a != null) {
                                                                        du1VarM4185k0 = x62Var.m5564h0().m4185k0(this.f6549m, rz1Var, rz1VarM3667a.m4464y());
                                                                        x62Var.m5564h0().m4177b0("events", du1VarM4185k0);
                                                                        if (z) {
                                                                            j = du1VarM4185k0.f1831c;
                                                                            strM4464y = rz1VarM3667a.m4464y();
                                                                            map8 = (Map) c0089c13.get(strM4464y);
                                                                            if (map8 == null) {
                                                                                qt1 qt1VarM5564h9 = x62Var.m5564h0();
                                                                                f02 f02Var10 = (f02) qt1VarM5564h9.f7192j;
                                                                                str11 = this.f6549m;
                                                                                qt1VarM5564h9.m2988B();
                                                                                qt1VarM5564h9.mo11z();
                                                                                p80.m3860e(str11);
                                                                                p80.m3860e(strM4464y);
                                                                                c0089c14 = new C0089c8();
                                                                                Query = qt1VarM5564h9.m4191r0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM4464y}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        vw1 vw1Var8 = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query.getBlob(1))).m5683d();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c0089c14.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            c0089c14.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(vw1Var8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = c0089c14;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                c0089c13.put(strM4464y, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.f6550n.contains(num6)) {
                                                                                    f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zM4115a = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            ob2Var2 = ob2Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        vw1 vw1Var9 = (vw1) it8.next();
                                                                                        ob2Var2 = ob2Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var9, 0);
                                                                                        Long l9 = this.f6552p;
                                                                                        Long l10 = this.f6553q;
                                                                                        iM5211u = vw1Var9.m5211u();
                                                                                        wa2Var = (wa2) this.f6551o.get(num3);
                                                                                        if (wa2Var == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = wa2Var.f8489d.get(iM5211u);
                                                                                        }
                                                                                        zM4115a = qm1Var2.m4115a(l9, l10, rz1VarM3667a, j, du1VarM4185k0, z5);
                                                                                        if (!zM4115a) {
                                                                                            this.f6550n.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        m4121F(num3).m5309a(qm1Var2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        ob2Var = ob2Var2;
                                                                                    }
                                                                                    if (!zM4115a) {
                                                                                        this.f6550n.add(num3);
                                                                                    }
                                                                                    ob2Var = ob2Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                C0089c8 c0089c19 = new C0089c8();
                                                                it4 = list2.iterator();
                                                                w71Var = c0089c19;
                                                                while (it4.hasNext()) {
                                                                    t02 t02Var3 = (t02) it4.next();
                                                                    strM4643v = t02Var3.m4643v();
                                                                    map6 = (Map) w71Var.get(strM4643v);
                                                                    if (map6 == null) {
                                                                        qt1 qt1VarM5564h10 = x62Var.m5564h0();
                                                                        f02Var4 = (f02) qt1VarM5564h10.f7192j;
                                                                        str9 = this.f6549m;
                                                                        qt1VarM5564h10.m2988B();
                                                                        qt1VarM5564h10.mo11z();
                                                                        p80.m3860e(str9);
                                                                        p80.m3860e(strM4643v);
                                                                        c0089c12 = new C0089c8();
                                                                        cursorQuery2 = qt1VarM5564h10.m4191r0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM4643v}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                ex1 ex1Var4 = (ex1) ((cx1) a72.m58l0(ex1.m1508B(), cursorQuery2.getBlob(1))).m5683d();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c0089c12.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    f02Var5 = f02Var4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    c0089c12.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    f02Var5 = f02Var4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(ex1Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                f02Var4 = f02Var5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = c0089c12;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        w71Var.put(strM4643v, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    w71Var2 = w71Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.f6550n.contains(num2)) {
                                                                            f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zM4116b = true;
                                                                        w71Var3 = w71Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                ex1Var = (ex1) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                                                    wc1 wc1VarM3112H5 = f02Var.mo1563b().m3112H();
                                                                                    if (ex1Var.m1511t()) {
                                                                                        numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    wc1VarM3112H5.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                                                    f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                                                                }
                                                                                if (ex1Var.m1511t()) {
                                                                                }
                                                                                wc1 wc1VarM3110F5 = f02Var.mo1563b().m3110F();
                                                                                iy1 iy1VarM3106I5 = ky1.m3106I(this.f6549m);
                                                                                if (ex1Var.m1511t()) {
                                                                                    numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                wc1VarM3110F5.m5314c(iy1VarM3106I5, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.f6550n.add(num2);
                                                                                map6 = map7;
                                                                                w71Var2 = w71Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                w71Var3 = w71Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zM4116b) {
                                                                                this.f6550n.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            w71Var2 = w71Var3;
                                                                            it6 = it6;
                                                                            m4121F(num2).m5309a(qm1Var);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            w71Var3 = w71Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    w71Var = w71Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            C0941z7<Integer> c0941z9 = (C0941z7) this.f6551o.keySet();
                                                            c0941z9.removeAll(this.f6550n);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                wa2 wa2Var4 = (wa2) this.f6551o.get(num7);
                                                                p80.m3863h(wa2Var4);
                                                                ez1 ez1VarM5310b3 = wa2Var4.m5310b(iIntValue5);
                                                                arrayList2.add(ez1VarM5310b3);
                                                                qt1VarM5564h1 = x62Var.m5564h0();
                                                                f02Var3 = (f02) qt1VarM5564h1.f7192j;
                                                                str8 = this.f6549m;
                                                                m02 m02VarM1535v3 = ez1VarM5310b3.m1535v();
                                                                qt1VarM5564h1.m2988B();
                                                                qt1VarM5564h1.mo11z();
                                                                p80.m3860e(str8);
                                                                p80.m3863h(m02VarM1535v3);
                                                                byte[] bArrM1274a3 = m02VarM1535v3.m1274a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrM1274a3);
                                                                if (qt1VarM5564h1.m4191r0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    f02Var3.mo1563b().m3109E().m5313b(ky1.m3106I(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = c0089c15;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    f02Var = f02Var6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.f6549m;
                                                        qt1VarM5564h0 = x62Var.m5564h0();
                                                        str6 = this.f6549m;
                                                        qt1VarM5564h0.m2988B();
                                                        qt1VarM5564h0.mo11z();
                                                        p80.m3860e(str6);
                                                        c0089c10 = new C0089c8();
                                                        cursorRawQuery = qt1VarM5564h0.m4191r0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) c0089c10.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c0089c10.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            c0089c10 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = c0089c10;
                                                        p80.m3860e(str112);
                                                        c0089c11 = new C0089c8();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                m02Var3 = (m02) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                f02Var2 = f02Var6;
                                                                c0089c11.put(num, m02Var3);
                                                                r0 = r18;
                                                                str15 = str15;
                                                                it2 = it3;
                                                                f02Var6 = f02Var2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        f02Var = f02Var6;
                                                        map3 = c0089c11;
                                                    } else {
                                                        str4 = "audience_id";
                                                        f02Var = f02Var6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        m02Var = (m02) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c0089c8 = new C0089c8();
                                                        if (m02Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (pz1Var.m4016t()) {
                                                                    m02 m02Var11 = m02Var;
                                                                    Integer numValueOf12 = Integer.valueOf(pz1Var.m4017u());
                                                                    if (pz1Var.m4018v()) {
                                                                        lValueOf = Long.valueOf(pz1Var.m4019w());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c0089c8.put(numValueOf12, lValueOf);
                                                                    m02Var = m02Var11;
                                                                }
                                                            }
                                                        }
                                                        m02Var2 = m02Var;
                                                        c0089c9 = new C0089c8();
                                                        if (m02Var2 != null) {
                                                            it = m02Var2.m3313z().iterator();
                                                            while (it.hasNext()) {
                                                                p02Var = (p02) it.next();
                                                                if (!p02Var.m3825t()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (m02Var2 != null) {
                                                            i = 0;
                                                            while (i < m02Var2.m3308u() * 64) {
                                                                if (a72.m56f0((jp1) m02Var2.m3307t(), i)) {
                                                                    z4 = zM770L;
                                                                    f02Var.mo1563b().m3112H().m5314c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (a72.m56f0((jp1) m02Var2.m3309v(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zM770L = z4;
                                                                } else {
                                                                    z4 = zM770L;
                                                                }
                                                                c0089c8.remove(Integer.valueOf(i));
                                                                i++;
                                                                zM770L = z4;
                                                            }
                                                        }
                                                        boolean z9 = zM770L;
                                                        m02 m02Var12 = (m02) map4.get(num4);
                                                        if (zM770L2) {
                                                            while (r2.hasNext()) {
                                                                int iM5211u5 = vw1Var2.m5211u();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f6553q.longValue() / 1000;
                                                                if (vw1Var2.m5205C()) {
                                                                    jLongValue = this.f6552p.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iM5211u5);
                                                                if (c0089c8.containsKey(numValueOf)) {
                                                                    c0089c8.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (c0089c9.containsKey(numValueOf)) {
                                                                    c0089c9.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f6551o.put(num4, new wa2(this, this.f6549m, m02Var12, bitSet, bitSet2, c0089c8, c0089c9));
                                                        map = map;
                                                        zM770L = z9;
                                                        map4 = map4;
                                                        zM770L2 = zM770L2;
                                                        str3 = str3;
                                                        map5 = map18;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r13 = obj2;
                                                if (!list.isEmpty()) {
                                                    ob2Var = new ob2(this);
                                                    c0089c13 = new C0089c8();
                                                    while (r17.hasNext()) {
                                                        rz1VarM3667a = ob2Var.m3667a(this.f6549m, rz1Var);
                                                        if (rz1VarM3667a != null) {
                                                            du1VarM4185k0 = x62Var.m5564h0().m4185k0(this.f6549m, rz1Var, rz1VarM3667a.m4464y());
                                                            x62Var.m5564h0().m4177b0("events", du1VarM4185k0);
                                                            if (z) {
                                                                j = du1VarM4185k0.f1831c;
                                                                strM4464y = rz1VarM3667a.m4464y();
                                                                map8 = (Map) c0089c13.get(strM4464y);
                                                                if (map8 == null) {
                                                                    qt1 qt1VarM5564h11 = x62Var.m5564h0();
                                                                    f02 f02Var11 = (f02) qt1VarM5564h11.f7192j;
                                                                    str11 = this.f6549m;
                                                                    qt1VarM5564h11.m2988B();
                                                                    qt1VarM5564h11.mo11z();
                                                                    p80.m3860e(str11);
                                                                    p80.m3860e(strM4464y);
                                                                    c0089c14 = new C0089c8();
                                                                    Query = qt1VarM5564h11.m4191r0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM4464y}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            vw1 vw1Var10 = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query.getBlob(1))).m5683d();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) c0089c14.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                c0089c14.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(vw1Var10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = c0089c14;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    c0089c13.put(strM4464y, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.f6550n.contains(num6)) {
                                                                        f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zM4115a = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                ob2Var2 = ob2Var;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            vw1 vw1Var11 = (vw1) it8.next();
                                                                            ob2Var2 = ob2Var;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var11, 0);
                                                                            Long l11 = this.f6552p;
                                                                            Long l12 = this.f6553q;
                                                                            iM5211u = vw1Var11.m5211u();
                                                                            wa2Var = (wa2) this.f6551o.get(num3);
                                                                            if (wa2Var == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = wa2Var.f8489d.get(iM5211u);
                                                                            }
                                                                            zM4115a = qm1Var2.m4115a(l11, l12, rz1VarM3667a, j, du1VarM4185k0, z5);
                                                                            if (!zM4115a) {
                                                                                this.f6550n.add(num3);
                                                                                break;
                                                                            }
                                                                            m4121F(num3).m5309a(qm1Var2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            ob2Var = ob2Var2;
                                                                        }
                                                                        if (!zM4115a) {
                                                                            this.f6550n.add(num3);
                                                                        }
                                                                        ob2Var = ob2Var2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    C0089c8 c0089c110 = new C0089c8();
                                                    it4 = list2.iterator();
                                                    w71Var = c0089c110;
                                                    while (it4.hasNext()) {
                                                        t02 t02Var4 = (t02) it4.next();
                                                        strM4643v = t02Var4.m4643v();
                                                        map6 = (Map) w71Var.get(strM4643v);
                                                        if (map6 == null) {
                                                            qt1 qt1VarM5564h12 = x62Var.m5564h0();
                                                            f02Var4 = (f02) qt1VarM5564h12.f7192j;
                                                            str9 = this.f6549m;
                                                            qt1VarM5564h12.m2988B();
                                                            qt1VarM5564h12.mo11z();
                                                            p80.m3860e(str9);
                                                            p80.m3860e(strM4643v);
                                                            c0089c12 = new C0089c8();
                                                            cursorQuery2 = qt1VarM5564h12.m4191r0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM4643v}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    ex1 ex1Var5 = (ex1) ((cx1) a72.m58l0(ex1.m1508B(), cursorQuery2.getBlob(1))).m5683d();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c0089c12.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        f02Var5 = f02Var4;
                                                                        arrayList3 = new ArrayList();
                                                                        c0089c12.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        f02Var5 = f02Var4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(ex1Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    f02Var4 = f02Var5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = c0089c12;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            w71Var.put(strM4643v, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        w71Var2 = w71Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.f6550n.contains(num2)) {
                                                                f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zM4116b = true;
                                                            w71Var3 = w71Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    ex1Var = (ex1) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                                        wc1 wc1VarM3112H6 = f02Var.mo1563b().m3112H();
                                                                        if (ex1Var.m1511t()) {
                                                                            numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        wc1VarM3112H6.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                                        f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                                                    }
                                                                    if (ex1Var.m1511t()) {
                                                                    }
                                                                    wc1 wc1VarM3110F6 = f02Var.mo1563b().m3110F();
                                                                    iy1 iy1VarM3106I6 = ky1.m3106I(this.f6549m);
                                                                    if (ex1Var.m1511t()) {
                                                                        numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    wc1VarM3110F6.m5314c(iy1VarM3106I6, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.f6550n.add(num2);
                                                                    map6 = map7;
                                                                    w71Var2 = w71Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    w71Var3 = w71Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zM4116b) {
                                                                    this.f6550n.add(num2);
                                                                }
                                                                map6 = map7;
                                                                w71Var2 = w71Var3;
                                                                it6 = it6;
                                                                m4121F(num2).m5309a(qm1Var);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                w71Var3 = w71Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        w71Var = w71Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                C0941z7<Integer> c0941z10 = (C0941z7) this.f6551o.keySet();
                                                c0941z10.removeAll(this.f6550n);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    wa2 wa2Var5 = (wa2) this.f6551o.get(num7);
                                                    p80.m3863h(wa2Var5);
                                                    ez1 ez1VarM5310b4 = wa2Var5.m5310b(iIntValue6);
                                                    arrayList2.add(ez1VarM5310b4);
                                                    qt1VarM5564h1 = x62Var.m5564h0();
                                                    f02Var3 = (f02) qt1VarM5564h1.f7192j;
                                                    str8 = this.f6549m;
                                                    m02 m02VarM1535v4 = ez1VarM5310b4.m1535v();
                                                    qt1VarM5564h1.m2988B();
                                                    qt1VarM5564h1.mo11z();
                                                    p80.m3860e(str8);
                                                    p80.m3863h(m02VarM1535v4);
                                                    byte[] bArrM1274a4 = m02VarM1535v4.m1274a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrM1274a4);
                                                    if (qt1VarM5564h1.m4191r0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        f02Var3.mo1563b().m3109E().m5313b(ky1.m3106I(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = c0089c16;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query2;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        qt1 qt1VarM5564h13 = x62Var.m5564h0();
                        obj = (f02) qt1VarM5564h13.f7192j;
                        r5 = this.f6549m;
                        qt1VarM5564h13.m2988B();
                        qt1VarM5564h13.mo11z();
                        p80.m3860e(r5);
                        cursorQuery = qt1VarM5564h13.m4191r0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            c0089c15 = new C0089c8();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                m02 m02Var13 = (m02) ((l02) a72.m58l0(m02.m3296B(), cursorQuery.getBlob(1))).m5683d();
                                Object objValueOf2 = Integer.valueOf(i3);
                                c0089c15.put(objValueOf2, m02Var13);
                                str3 = str14;
                                obj2 = objM3106I;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objM3106I = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = c0089c15;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            f02Var = f02Var6;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str114 = this.f6549m;
                                qt1VarM5564h0 = x62Var.m5564h0();
                                str6 = this.f6549m;
                                qt1VarM5564h0.m2988B();
                                qt1VarM5564h0.mo11z();
                                p80.m3860e(str6);
                                c0089c10 = new C0089c8();
                                cursorRawQuery = qt1VarM5564h0.m4191r0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) c0089c10.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            c0089c10.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    c0089c10 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = c0089c10;
                                p80.m3860e(str114);
                                c0089c11 = new C0089c8();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        m02Var3 = (m02) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            f02Var2 = f02Var6;
                                            c0089c11.put(num, m02Var3);
                                            r0 = r18;
                                            str15 = str15;
                                            it2 = it3;
                                            f02Var6 = f02Var2;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listM73h0 = x62Var.m5570k0().m73h0((jp1) m02Var3.m3309v(), list4);
                                            if (listM73h0.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                l02 l02Var = (l02) m02Var3.m5969k();
                                                l02Var.m3136h();
                                                l02Var.m5681b();
                                                ((m02) l02Var.f9011k).m3301F(listM73h0);
                                                List listM73h1 = x62Var.m5570k0().m73h0((jp1) m02Var3.m3307t(), list4);
                                                l02Var.m3135g();
                                                l02Var.m5681b();
                                                ((m02) l02Var.f9011k).m3299D(listM73h1);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it10 = m02Var3.m3311x().iterator();
                                                while (it10.hasNext()) {
                                                    Iterator it11 = it10;
                                                    pz1 pz1Var2 = (pz1) it10.next();
                                                    f02 f02Var12 = f02Var6;
                                                    if (!list4.contains(Integer.valueOf(pz1Var2.m4017u()))) {
                                                        arrayList6.add(pz1Var2);
                                                    }
                                                    it10 = it11;
                                                    f02Var6 = f02Var12;
                                                }
                                                f02Var2 = f02Var6;
                                                l02Var.m3137i();
                                                l02Var.m5681b();
                                                ((m02) l02Var.f9011k).m3303H(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (p02 p02Var2 : m02Var3.m3313z()) {
                                                    if (!list4.contains(Integer.valueOf(p02Var2.m3826u()))) {
                                                        arrayList7.add(p02Var2);
                                                    }
                                                }
                                                l02Var.m3138j();
                                                l02Var.m5681b();
                                                ((m02) l02Var.f9011k).m3305J(arrayList7);
                                                c0089c11.put(num, (m02) l02Var.m5683d());
                                                r18 = r112;
                                                r0 = r18;
                                                str15 = str15;
                                                it2 = it3;
                                                f02Var6 = f02Var2;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                f02Var = f02Var6;
                                map3 = c0089c11;
                            } else {
                                str4 = "audience_id";
                                f02Var = f02Var6;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                m02Var = (m02) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                c0089c8 = new C0089c8();
                                if (m02Var != null && m02Var.m3312y() != 0) {
                                    while (r3.hasNext()) {
                                        if (pz1Var.m4016t()) {
                                            m02 m02Var14 = m02Var;
                                            Integer numValueOf13 = Integer.valueOf(pz1Var.m4017u());
                                            if (pz1Var.m4018v()) {
                                                lValueOf = Long.valueOf(pz1Var.m4019w());
                                            } else {
                                                lValueOf = null;
                                            }
                                            c0089c8.put(numValueOf13, lValueOf);
                                            m02Var = m02Var14;
                                        }
                                    }
                                }
                                m02Var2 = m02Var;
                                c0089c9 = new C0089c8();
                                if (m02Var2 != null && m02Var2.m3298A() != 0) {
                                    it = m02Var2.m3313z().iterator();
                                    while (it.hasNext()) {
                                        p02Var = (p02) it.next();
                                        if (!p02Var.m3825t() && p02Var.m3828w() > 0) {
                                            c0089c9.put(Integer.valueOf(p02Var.m3826u()), Long.valueOf(p02Var.m3829x(p02Var.m3828w() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (m02Var2 != null) {
                                    i = 0;
                                    while (i < m02Var2.m3308u() * 64) {
                                        if (a72.m56f0((jp1) m02Var2.m3307t(), i)) {
                                            z4 = zM770L;
                                            f02Var.mo1563b().m3112H().m5314c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i);
                                            if (a72.m56f0((jp1) m02Var2.m3309v(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zM770L = z4;
                                        } else {
                                            z4 = zM770L;
                                        }
                                        c0089c8.remove(Integer.valueOf(i));
                                        i++;
                                        zM770L = z4;
                                    }
                                }
                                boolean z10 = zM770L;
                                m02 m02Var15 = (m02) map4.get(num4);
                                if (zM770L2 && z10 && (list3 = (List) map.get(num4)) != null && this.f6553q != null && this.f6552p != null) {
                                    while (r2.hasNext()) {
                                        int iM5211u6 = vw1Var2.m5211u();
                                        Integer num11 = num4;
                                        jLongValue = this.f6553q.longValue() / 1000;
                                        if (vw1Var2.m5205C()) {
                                            jLongValue = this.f6552p.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iM5211u6);
                                        if (c0089c8.containsKey(numValueOf)) {
                                            c0089c8.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (c0089c9.containsKey(numValueOf)) {
                                            c0089c9.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.f6551o.put(num4, new wa2(this, this.f6549m, m02Var15, bitSet, bitSet2, c0089c8, c0089c9));
                                map = map;
                                zM770L = z10;
                                map4 = map4;
                                zM770L2 = zM770L2;
                                str3 = str3;
                                map5 = map110;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r14 = obj2;
                        if (!list.isEmpty()) {
                            ob2Var = new ob2(this);
                            c0089c13 = new C0089c8();
                            while (r17.hasNext()) {
                                rz1VarM3667a = ob2Var.m3667a(this.f6549m, rz1Var);
                                if (rz1VarM3667a != null) {
                                    du1VarM4185k0 = x62Var.m5564h0().m4185k0(this.f6549m, rz1Var, rz1VarM3667a.m4464y());
                                    x62Var.m5564h0().m4177b0("events", du1VarM4185k0);
                                    if (z) {
                                        j = du1VarM4185k0.f1831c;
                                        strM4464y = rz1VarM3667a.m4464y();
                                        map8 = (Map) c0089c13.get(strM4464y);
                                        if (map8 == null) {
                                            qt1 qt1VarM5564h14 = x62Var.m5564h0();
                                            f02 f02Var13 = (f02) qt1VarM5564h14.f7192j;
                                            str11 = this.f6549m;
                                            qt1VarM5564h14.m2988B();
                                            qt1VarM5564h14.mo11z();
                                            p80.m3860e(str11);
                                            p80.m3860e(strM4464y);
                                            c0089c14 = new C0089c8();
                                            Query = qt1VarM5564h14.m4191r0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM4464y}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str12 = str11;
                                                Query = Query;
                                                r46 = list;
                                                while (true) {
                                                    vw1 vw1Var12 = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query.getBlob(1))).m5683d();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) c0089c14.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r46 = Query;
                                                        arrayList4 = new ArrayList();
                                                        c0089c14.put(numValueOf6, arrayList4);
                                                        r48 = r46;
                                                    } else {
                                                        r48 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(vw1Var12);
                                                    r47 = r48;
                                                    if (!r47.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r47;
                                                    r46 = r47;
                                                }
                                                r47.close();
                                                map8 = c0089c14;
                                                r43 = r47;
                                            } else {
                                                ?? r413 = Query;
                                                map8 = Collections.EMPTY_MAP;
                                                r413.close();
                                                r43 = r413;
                                            }
                                            c0089c13.put(strM4464y, map8);
                                            list = r43;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.f6550n.contains(num6)) {
                                                f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                                            } else {
                                                it8 = ((List) map8.get(num6)).iterator();
                                                zM4115a = true;
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        map9 = map8;
                                                        ob2Var2 = ob2Var;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    vw1 vw1Var13 = (vw1) it8.next();
                                                    ob2Var2 = ob2Var;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var13, 0);
                                                    Long l13 = this.f6552p;
                                                    Long l14 = this.f6553q;
                                                    iM5211u = vw1Var13.m5211u();
                                                    wa2Var = (wa2) this.f6551o.get(num3);
                                                    if (wa2Var == null) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = wa2Var.f8489d.get(iM5211u);
                                                    }
                                                    zM4115a = qm1Var2.m4115a(l13, l14, rz1VarM3667a, j, du1VarM4185k0, z5);
                                                    if (!zM4115a) {
                                                        this.f6550n.add(num3);
                                                        break;
                                                    }
                                                    m4121F(num3).m5309a(qm1Var2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    ob2Var = ob2Var2;
                                                }
                                                if (!zM4115a) {
                                                    this.f6550n.add(num3);
                                                }
                                                ob2Var = ob2Var2;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            C0089c8 c0089c111 = new C0089c8();
                            it4 = list2.iterator();
                            w71Var = c0089c111;
                            while (it4.hasNext()) {
                                t02 t02Var5 = (t02) it4.next();
                                strM4643v = t02Var5.m4643v();
                                map6 = (Map) w71Var.get(strM4643v);
                                if (map6 == null) {
                                    qt1 qt1VarM5564h15 = x62Var.m5564h0();
                                    f02Var4 = (f02) qt1VarM5564h15.f7192j;
                                    str9 = this.f6549m;
                                    qt1VarM5564h15.m2988B();
                                    qt1VarM5564h15.mo11z();
                                    p80.m3860e(str9);
                                    p80.m3860e(strM4643v);
                                    c0089c12 = new C0089c8();
                                    cursorQuery2 = qt1VarM5564h15.m4191r0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM4643v}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            ex1 ex1Var6 = (ex1) ((cx1) a72.m58l0(ex1.m1508B(), cursorQuery2.getBlob(1))).m5683d();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) c0089c12.get(numValueOf5);
                                            if (list5 == null) {
                                                f02Var5 = f02Var4;
                                                arrayList3 = new ArrayList();
                                                c0089c12.put(numValueOf5, arrayList3);
                                            } else {
                                                f02Var5 = f02Var4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(ex1Var6);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            f02Var4 = f02Var5;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = c0089c12;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    w71Var.put(strM4643v, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                w71Var2 = w71Var;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.f6550n.contains(num2)) {
                                        f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zM4116b = true;
                                    w71Var3 = w71Var2;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            ex1Var = (ex1) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                                wc1 wc1VarM3112H7 = f02Var.mo1563b().m3112H();
                                                if (ex1Var.m1511t()) {
                                                    numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                wc1VarM3112H7.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                                f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                                            }
                                            if (ex1Var.m1511t() || ex1Var.m1512u() > 256) {
                                                wc1 wc1VarM3110F7 = f02Var.mo1563b().m3110F();
                                                iy1 iy1VarM3106I7 = ky1.m3106I(this.f6549m);
                                                if (ex1Var.m1511t()) {
                                                    numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                wc1VarM3110F7.m5314c(iy1VarM3106I7, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                this.f6550n.add(num2);
                                                map6 = map7;
                                                w71Var2 = w71Var3;
                                                it6 = it6;
                                            } else {
                                                i2 = iIntValue;
                                                qm1Var = new qm1(this, this.f6549m, i2, ex1Var, 1);
                                                Long l15 = this.f6552p;
                                                Long l16 = this.f6553q;
                                                int iM1512u = ex1Var.m1512u();
                                                wa2 wa2Var6 = (wa2) this.f6551o.get(num2);
                                                zM4116b = qm1Var.m4116b(l15, l16, t02Var5, wa2Var6 == null ? false : wa2Var6.f8489d.get(iM1512u));
                                                if (zM4116b) {
                                                    m4121F(num2).m5309a(qm1Var);
                                                    iIntValue = i2;
                                                    map6 = map7;
                                                    w71Var3 = w71Var3;
                                                    it6 = it6;
                                                } else {
                                                    this.f6550n.add(num2);
                                                    w71Var3 = w71Var3;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            w71Var3 = w71Var3;
                                            it6 = it6;
                                        }
                                        if (!zM4116b) {
                                            this.f6550n.add(num2);
                                        }
                                        map6 = map7;
                                        w71Var2 = w71Var3;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                w71Var = w71Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        C0941z7<Integer> c0941z11 = (C0941z7) this.f6551o.keySet();
                        c0941z11.removeAll(this.f6550n);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            wa2 wa2Var7 = (wa2) this.f6551o.get(num7);
                            p80.m3863h(wa2Var7);
                            ez1 ez1VarM5310b5 = wa2Var7.m5310b(iIntValue7);
                            arrayList2.add(ez1VarM5310b5);
                            qt1VarM5564h1 = x62Var.m5564h0();
                            f02Var3 = (f02) qt1VarM5564h1.f7192j;
                            str8 = this.f6549m;
                            m02 m02VarM1535v5 = ez1VarM5310b5.m1535v();
                            qt1VarM5564h1.m2988B();
                            qt1VarM5564h1.mo11z();
                            p80.m3860e(str8);
                            p80.m3863h(m02VarM1535v5);
                            byte[] bArrM1274a5 = m02VarM1535v5.m1274a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrM1274a5);
                            if (qt1VarM5564h1.m4191r0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                f02Var3.mo1563b().m3109E().m5313b(ky1.m3106I(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        c0089c15 = new C0089c8();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            m02 m02Var16 = (m02) ((l02) a72.m58l0(m02.m3296B(), cursorQuery.getBlob(1))).m5683d();
                            Object objValueOf3 = Integer.valueOf(i3);
                            c0089c15.put(objValueOf3, m02Var16);
                            str3 = str14;
                            obj2 = objM3106I;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objM3106I = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = c0089c15;
                    }
                } catch (SQLiteException e26) {
                    e = e26;
                    r17 = obj;
                    r21 = r5;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = qt1VarM5564h13.m4191r0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        qt1 qt1VarM5564h16 = x62Var.m5564h0();
        obj = (f02) qt1VarM5564h16.f7192j;
        r5 = this.f6549m;
        qt1VarM5564h16.m2988B();
        qt1VarM5564h16.mo11z();
        p80.m3860e(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            f02Var = f02Var6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.f6549m;
                qt1VarM5564h0 = x62Var.m5564h0();
                str6 = this.f6549m;
                qt1VarM5564h0.m2988B();
                qt1VarM5564h0.mo11z();
                p80.m3860e(str6);
                c0089c10 = new C0089c8();
                cursorRawQuery = qt1VarM5564h0.m4191r0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c0089c10.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c0089c10.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c0089c10 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = c0089c10;
                p80.m3860e(str116);
                c0089c11 = new C0089c8();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        m02Var3 = (m02) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        f02Var2 = f02Var6;
                        c0089c11.put(num, m02Var3);
                        r0 = r18;
                        str15 = str15;
                        it2 = it3;
                        f02Var6 = f02Var2;
                    }
                }
                str4 = str15;
                f02Var = f02Var6;
                map3 = c0089c11;
            } else {
                str4 = "audience_id";
                f02Var = f02Var6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                m02Var = (m02) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c0089c8 = new C0089c8();
                if (m02Var != null) {
                    while (r3.hasNext()) {
                        if (pz1Var.m4016t()) {
                            m02 m02Var17 = m02Var;
                            Integer numValueOf14 = Integer.valueOf(pz1Var.m4017u());
                            if (pz1Var.m4018v()) {
                                lValueOf = Long.valueOf(pz1Var.m4019w());
                            } else {
                                lValueOf = null;
                            }
                            c0089c8.put(numValueOf14, lValueOf);
                            m02Var = m02Var17;
                        }
                    }
                }
                m02Var2 = m02Var;
                c0089c9 = new C0089c8();
                if (m02Var2 != null) {
                    it = m02Var2.m3313z().iterator();
                    while (it.hasNext()) {
                        p02Var = (p02) it.next();
                        if (!p02Var.m3825t()) {
                        }
                    }
                }
                Map map112 = map5;
                if (m02Var2 != null) {
                    i = 0;
                    while (i < m02Var2.m3308u() * 64) {
                        if (a72.m56f0((jp1) m02Var2.m3307t(), i)) {
                            z4 = zM770L;
                            f02Var.mo1563b().m3112H().m5314c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (a72.m56f0((jp1) m02Var2.m3309v(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zM770L = z4;
                        } else {
                            z4 = zM770L;
                        }
                        c0089c8.remove(Integer.valueOf(i));
                        i++;
                        zM770L = z4;
                    }
                }
                boolean z11 = zM770L;
                m02 m02Var18 = (m02) map4.get(num4);
                if (zM770L2) {
                    while (r2.hasNext()) {
                        int iM5211u7 = vw1Var2.m5211u();
                        Integer num12 = num4;
                        jLongValue = this.f6553q.longValue() / 1000;
                        if (vw1Var2.m5205C()) {
                            jLongValue = this.f6552p.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iM5211u7);
                        if (c0089c8.containsKey(numValueOf)) {
                            c0089c8.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (c0089c9.containsKey(numValueOf)) {
                            c0089c9.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f6551o.put(num4, new wa2(this, this.f6549m, m02Var18, bitSet, bitSet2, c0089c8, c0089c9));
                map = map;
                zM770L = z11;
                map4 = map4;
                zM770L2 = zM770L2;
                str3 = str3;
                map5 = map112;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r15 = obj2;
        if (!list.isEmpty()) {
            ob2Var = new ob2(this);
            c0089c13 = new C0089c8();
            while (r17.hasNext()) {
                rz1VarM3667a = ob2Var.m3667a(this.f6549m, rz1Var);
                if (rz1VarM3667a != null) {
                    du1VarM4185k0 = x62Var.m5564h0().m4185k0(this.f6549m, rz1Var, rz1VarM3667a.m4464y());
                    x62Var.m5564h0().m4177b0("events", du1VarM4185k0);
                    if (z) {
                        j = du1VarM4185k0.f1831c;
                        strM4464y = rz1VarM3667a.m4464y();
                        map8 = (Map) c0089c13.get(strM4464y);
                        if (map8 == null) {
                            qt1 qt1VarM5564h17 = x62Var.m5564h0();
                            f02 f02Var14 = (f02) qt1VarM5564h17.f7192j;
                            str11 = this.f6549m;
                            qt1VarM5564h17.m2988B();
                            qt1VarM5564h17.mo11z();
                            p80.m3860e(str11);
                            p80.m3860e(strM4464y);
                            c0089c14 = new C0089c8();
                            Query = qt1VarM5564h17.m4191r0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strM4464y}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    vw1 vw1Var14 = (vw1) ((uw1) a72.m58l0(vw1.m5202F(), Query.getBlob(1))).m5683d();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) c0089c14.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        c0089c14.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(vw1Var14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = c0089c14;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            c0089c13.put(strM4464y, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.f6550n.contains(num6)) {
                                f02Var.mo1563b().m3112H().m5313b(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zM4115a = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        ob2Var2 = ob2Var;
                                        num3 = num6;
                                        break;
                                    }
                                    vw1 vw1Var15 = (vw1) it8.next();
                                    ob2Var2 = ob2Var;
                                    num3 = num6;
                                    map9 = map8;
                                    qm1Var2 = new qm1(this, this.f6549m, iIntValue2, vw1Var15, 0);
                                    Long l17 = this.f6552p;
                                    Long l18 = this.f6553q;
                                    iM5211u = vw1Var15.m5211u();
                                    wa2Var = (wa2) this.f6551o.get(num3);
                                    if (wa2Var == null) {
                                        z5 = false;
                                    } else {
                                        z5 = wa2Var.f8489d.get(iM5211u);
                                    }
                                    zM4115a = qm1Var2.m4115a(l17, l18, rz1VarM3667a, j, du1VarM4185k0, z5);
                                    if (!zM4115a) {
                                        this.f6550n.add(num3);
                                        break;
                                    }
                                    m4121F(num3).m5309a(qm1Var2);
                                    num6 = num3;
                                    map8 = map9;
                                    ob2Var = ob2Var2;
                                }
                                if (!zM4115a) {
                                    this.f6550n.add(num3);
                                }
                                ob2Var = ob2Var2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            C0089c8 c0089c112 = new C0089c8();
            it4 = list2.iterator();
            w71Var = c0089c112;
            while (it4.hasNext()) {
                t02 t02Var6 = (t02) it4.next();
                strM4643v = t02Var6.m4643v();
                map6 = (Map) w71Var.get(strM4643v);
                if (map6 == null) {
                    qt1 qt1VarM5564h18 = x62Var.m5564h0();
                    f02Var4 = (f02) qt1VarM5564h18.f7192j;
                    str9 = this.f6549m;
                    qt1VarM5564h18.m2988B();
                    qt1VarM5564h18.mo11z();
                    p80.m3860e(str9);
                    p80.m3860e(strM4643v);
                    c0089c12 = new C0089c8();
                    cursorQuery2 = qt1VarM5564h18.m4191r0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strM4643v}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            ex1 ex1Var7 = (ex1) ((cx1) a72.m58l0(ex1.m1508B(), cursorQuery2.getBlob(1))).m5683d();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c0089c12.get(numValueOf5);
                            if (list5 == null) {
                                f02Var5 = f02Var4;
                                arrayList3 = new ArrayList();
                                c0089c12.put(numValueOf5, arrayList3);
                            } else {
                                f02Var5 = f02Var4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(ex1Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            f02Var4 = f02Var5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = c0089c12;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    w71Var.put(strM4643v, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                w71Var2 = w71Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.f6550n.contains(num2)) {
                        f02Var.mo1563b().m3112H().m5313b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zM4116b = true;
                    w71Var3 = w71Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            ex1Var = (ex1) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(f02Var.mo1563b().m3114K(), 2)) {
                                wc1 wc1VarM3112H8 = f02Var.mo1563b().m3112H();
                                if (ex1Var.m1511t()) {
                                    numValueOf4 = Integer.valueOf(ex1Var.m1512u());
                                } else {
                                    numValueOf4 = null;
                                }
                                wc1VarM3112H8.m5315d("Evaluating filter. audience, filter, property", num2, numValueOf4, f02Var.m1571n().m1045c(ex1Var.m1513v()));
                                f02Var.mo1563b().m3112H().m5313b(x62Var.m5570k0().m71c0(ex1Var), "Filter definition");
                            }
                            if (ex1Var.m1511t()) {
                            }
                            wc1 wc1VarM3110F8 = f02Var.mo1563b().m3110F();
                            iy1 iy1VarM3106I8 = ky1.m3106I(this.f6549m);
                            if (ex1Var.m1511t()) {
                                numValueOf3 = Integer.valueOf(ex1Var.m1512u());
                            } else {
                                numValueOf3 = null;
                            }
                            wc1VarM3110F8.m5314c(iy1VarM3106I8, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.f6550n.add(num2);
                            map6 = map7;
                            w71Var2 = w71Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            w71Var3 = w71Var3;
                            it6 = it6;
                        }
                        if (!zM4116b) {
                            this.f6550n.add(num2);
                        }
                        map6 = map7;
                        w71Var2 = w71Var3;
                        it6 = it6;
                        m4121F(num2).m5309a(qm1Var);
                        iIntValue = i2;
                        map6 = map7;
                        w71Var3 = w71Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                w71Var = w71Var2;
            }
        }
        arrayList2 = new ArrayList();
        C0941z7<Integer> c0941z12 = (C0941z7) this.f6551o.keySet();
        c0941z12.removeAll(this.f6550n);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            wa2 wa2Var8 = (wa2) this.f6551o.get(num7);
            p80.m3863h(wa2Var8);
            ez1 ez1VarM5310b6 = wa2Var8.m5310b(iIntValue8);
            arrayList2.add(ez1VarM5310b6);
            qt1VarM5564h1 = x62Var.m5564h0();
            f02Var3 = (f02) qt1VarM5564h1.f7192j;
            str8 = this.f6549m;
            m02 m02VarM1535v6 = ez1VarM5310b6.m1535v();
            qt1VarM5564h1.m2988B();
            qt1VarM5564h1.mo11z();
            p80.m3860e(str8);
            p80.m3863h(m02VarM1535v6);
            byte[] bArrM1274a6 = m02VarM1535v6.m1274a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrM1274a6);
            if (qt1VarM5564h1.m4191r0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                f02Var3.mo1563b().m3109E().m5313b(ky1.m3106I(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: F */
    public final wa2 m4121F(Integer num) {
        if (this.f6551o.containsKey(num)) {
            return (wa2) this.f6551o.get(num);
        }
        wa2 wa2Var = new wa2(this, this.f6549m);
        this.f6551o.put(num, wa2Var);
        return wa2Var;
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
    }
}
