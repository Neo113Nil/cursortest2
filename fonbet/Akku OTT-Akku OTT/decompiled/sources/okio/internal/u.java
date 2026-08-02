package okio.internal;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.C;
import okio.F;
import okio.InterfaceC1192g;

@SourceDebugExtension({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n58#2,4:504\n58#2,4:508\n58#2,22:512\n66#2,10:534\n62#2,3:544\n77#2,3:547\n58#2,22:550\n66#2,10:572\n62#2,3:582\n77#2,3:585\n1056#3:588\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n66#1:504,4\n101#1:508,4\n109#1:512,22\n101#1:534,10\n101#1:544,3\n101#1:547,3\n125#1:550,22\n66#1:572,10\n66#1:582,3\n66#1:585,3\n155#1:588\n*E\n"})
/* loaded from: classes5.dex */
public final class u {
    public static final Map a(ArrayList arrayList) {
        C.Companion.getClass();
        C a = C.a.a(DomExceptionUtils.SEPARATOR, false);
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(a, new p(a, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (p pVar : CollectionsKt.sortedWith(arrayList, new t())) {
            if (((p) mutableMapOf.put(pVar.a, pVar)) == null) {
                while (true) {
                    C c = pVar.a;
                    C c2 = c.c();
                    if (c2 != null) {
                        p pVar2 = (p) mutableMapOf.get(c2);
                        if (pVar2 != null) {
                            pVar2.q.add(c);
                            break;
                        }
                        p pVar3 = new p(c2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        mutableMapOf.put(c2, pVar3);
                        pVar3.q.add(c);
                        pVar = pVar3;
                    }
                }
            }
        }
        return mutableMapOf;
    }

    public static final String b(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p c(final F f) throws IOException {
        boolean contains$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(f, "<this>");
        int P = f.P();
        if (P != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(P));
        }
        f.skip(4L);
        short v = f.v();
        int i = v & UShort.MAX_VALUE;
        if ((v & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        int v2 = f.v() & UShort.MAX_VALUE;
        int v3 = f.v() & UShort.MAX_VALUE;
        int v4 = f.v() & UShort.MAX_VALUE;
        long P2 = f.P() & KeyboardMap.kValueMask;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = f.P() & KeyboardMap.kValueMask;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = f.P() & KeyboardMap.kValueMask;
        int v5 = f.v() & UShort.MAX_VALUE;
        int v6 = f.v() & UShort.MAX_VALUE;
        int v7 = 65535 & f.v();
        f.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = f.P() & KeyboardMap.kValueMask;
        String q = f.q(v5);
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) q, (char) 0, false, 2, (Object) null);
        if (contains$default) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = longRef2.element == KeyboardMap.kValueMask ? 8 : 0L;
        if (longRef.element == KeyboardMap.kValueMask) {
            j += 8;
        }
        if (longRef3.element == KeyboardMap.kValueMask) {
            j += 8;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        d(f, v6, new Function2() { // from class: okio.internal.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                final F f2 = f;
                if (intValue == 1) {
                    Ref.BooleanRef booleanRef2 = Ref.BooleanRef.this;
                    if (booleanRef2.element) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    booleanRef2.element = true;
                    if (longValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref.LongRef longRef4 = longRef2;
                    long j2 = longRef4.element;
                    if (j2 == KeyboardMap.kValueMask) {
                        j2 = f2.l();
                    }
                    longRef4.element = j2;
                    Ref.LongRef longRef5 = longRef;
                    longRef5.element = longRef5.element == KeyboardMap.kValueMask ? f2.l() : 0L;
                    Ref.LongRef longRef6 = longRef3;
                    longRef6.element = longRef6.element == KeyboardMap.kValueMask ? f2.l() : 0L;
                } else if (intValue == 10) {
                    if (longValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    f2.skip(4L);
                    final Ref.ObjectRef objectRef4 = objectRef;
                    final Ref.ObjectRef objectRef5 = objectRef2;
                    final Ref.ObjectRef objectRef6 = objectRef3;
                    u.d(f2, (int) (longValue - 4), new Function2() { // from class: okio.internal.s
                        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Long] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int intValue2 = ((Integer) obj3).intValue();
                            long longValue2 = ((Long) obj4).longValue();
                            if (intValue2 == 1) {
                                Ref.ObjectRef objectRef7 = Ref.ObjectRef.this;
                                if (objectRef7.element != 0) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                }
                                if (longValue2 != 24) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                }
                                F f3 = f2;
                                objectRef7.element = Long.valueOf(f3.l());
                                objectRef5.element = Long.valueOf(f3.l());
                                objectRef6.element = Long.valueOf(f3.l());
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        });
        if (j > 0 && !booleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String q2 = f.q(v7);
        C.Companion.getClass();
        C e = C.a.a(DomExceptionUtils.SEPARATOR, false).e(q);
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(q, DomExceptionUtils.SEPARATOR, false, 2, null);
        return new p(e, endsWith$default, q2, P2, longRef.element, longRef2.element, v2, longRef3.element, v4, v3, (Long) objectRef.element, (Long) objectRef2.element, (Long) objectRef3.element, 57344);
    }

    public static final void d(InterfaceC1192g interfaceC1192g, int i, Function2<? super Integer, ? super Long, Unit> function2) {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int v = interfaceC1192g.v() & UShort.MAX_VALUE;
            long v2 = interfaceC1192g.v() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < v2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC1192g.A(v2);
            long j3 = interfaceC1192g.a().b;
            function2.invoke(Integer.valueOf(v), Long.valueOf(v2));
            long j4 = (interfaceC1192g.a().b + v2) - j3;
            if (j4 < 0) {
                throw new IOException(android.support.v4.media.a.a(v, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                interfaceC1192g.a().skip(j4);
            }
            j = j2 - v2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p e(final F f, p pVar) {
        int P = f.P();
        if (P != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(P));
        }
        f.skip(2L);
        short v = f.v();
        int i = v & UShort.MAX_VALUE;
        if ((v & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        f.skip(18L);
        long v2 = f.v() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int v3 = f.v() & UShort.MAX_VALUE;
        f.skip(v2);
        if (pVar == null) {
            f.skip(v3);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        d(f, v3, new Function2() { // from class: okio.internal.q
            /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r12v14, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r12v16, types: [T, java.lang.Integer] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    InterfaceC1192g interfaceC1192g = InterfaceC1192g.this;
                    byte readByte = interfaceC1192g.readByte();
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (longValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        objectRef.element = Integer.valueOf(interfaceC1192g.P());
                    }
                    if (z2) {
                        objectRef2.element = Integer.valueOf(interfaceC1192g.P());
                    }
                    if (z3) {
                        objectRef3.element = Integer.valueOf(interfaceC1192g.P());
                    }
                }
                return Unit.INSTANCE;
            }
        });
        return new p(pVar.a, pVar.b, pVar.c, pVar.d, pVar.e, pVar.f, pVar.g, pVar.h, pVar.i, pVar.j, pVar.k, pVar.l, pVar.m, (Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element);
    }
}
