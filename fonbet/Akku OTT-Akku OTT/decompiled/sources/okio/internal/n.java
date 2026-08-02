package okio.internal;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.session.legacy.PlaybackStateCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.webviewflutter.L;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okio.AbstractC1195j;
import okio.AbstractC1197l;
import okio.C;
import okio.C1196k;
import okio.F;
import okio.J;
import okio.K;
import okio.z;

@SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n774#2:216\n865#2,2:217\n1563#2:219\n1634#2,3:220\n774#2:223\n865#2,2:224\n1563#2:226\n1634#2,3:227\n1617#2,9:230\n1869#2:239\n1870#2:241\n1626#2:242\n1617#2,9:243\n1869#2:252\n1870#2:254\n1626#2:255\n1#3:240\n1#3:253\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n75#1:216\n75#1:217,2\n76#1:219\n76#1:220,3\n91#1:223\n91#1:224,2\n92#1:226\n92#1:227,3\n178#1:230,9\n178#1:239\n178#1:241\n178#1:242\n179#1:243,9\n179#1:252\n179#1:254\n179#1:255\n178#1:240\n179#1:253\n*E\n"})
/* loaded from: classes5.dex */
public final class n extends AbstractC1197l {
    public static final C d;
    public final ClassLoader a;
    public final AbstractC1197l b;
    public final Lazy c;

    public static final class a {
        public static final boolean a(C c) {
            boolean endsWith;
            C c2 = n.d;
            endsWith = StringsKt__StringsJVMKt.endsWith(c.b(), ".class", true);
            return !endsWith;
        }

        public static C b(C c, C base) {
            String removePrefix;
            String replace$default;
            Intrinsics.checkNotNullParameter(c, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            String r = base.a.r();
            C c2 = n.d;
            removePrefix = StringsKt__StringsKt.removePrefix(c.a.r(), (CharSequence) r);
            replace$default = StringsKt__StringsJVMKt.replace$default(removePrefix, '\\', '/', false, 4, (Object) null);
            return c2.e(replace$default);
        }
    }

    static {
        C.Companion.getClass();
        d = C.a.a(DomExceptionUtils.SEPARATOR, false);
    }

    public n(ClassLoader classLoader) {
        AbstractC1197l systemFileSystem = AbstractC1197l.SYSTEM;
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.a = classLoader;
        this.b = systemFileSystem;
        this.c = LazyKt.lazy(new Function0() { // from class: okio.internal.m
            /* JADX WARN: Code restructure failed: missing block: B:100:0x01ce, code lost:
            
                throw new java.io.IOException("unsupported zip: spanned");
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
            
                throw new java.io.IOException("bad zip: expected " + okio.internal.u.b(101075792) + " but was " + okio.internal.u.b(r11));
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x01f8, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x01cf, code lost:
            
                r10 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x0211, code lost:
            
                throw new java.io.IOException("unsupported zip: spanned");
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x0212, code lost:
            
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
            
                r8.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x0217, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x0226, code lost:
            
                if (r0 != null) goto L207;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x0228, code lost:
            
                r0 = r19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x0233, code lost:
            
                r8 = new java.util.ArrayList();
                r9 = okio.z.b(r1.x(r0.b));
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x0242, code lost:
            
                r10 = r0.a;
                r13 = r17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x024a, code lost:
            
                r12 = okio.internal.u.c(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x024e, code lost:
            
                r15 = r9;
                r19 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x0259, code lost:
            
                if (r12.h < r0.b) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x0265, code lost:
            
                if (((java.lang.Boolean) r7.invoke(r12)).booleanValue() != false) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0267, code lost:
            
                r8.add(r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x026e, code lost:
            
                r13 = r13 + 1;
                r9 = r15;
                r10 = r19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x027c, code lost:
            
                throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
             */
            /* JADX WARN: Code restructure failed: missing block: B:139:0x026b, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:140:0x026c, code lost:
            
                r7 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x028a, code lost:
            
                r15.close();
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x0294, code lost:
            
                r0 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x0295, code lost:
            
                if (r0 == null) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:145:0x0297, code lost:
            
                r7 = new okio.M(r5, r3, okio.internal.u.a(r8));
             */
            /* JADX WARN: Code restructure failed: missing block: B:147:0x02a0, code lost:
            
                r1.close();
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:148:0x02a5, code lost:
            
                r0 = kotlin.TuplesKt.to(r7, okio.internal.n.d);
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x02b4, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x0290, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x0291, code lost:
            
                kotlin.ExceptionsKt.addSuppressed(r7, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
            
                r15 = r9;
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x0283, code lost:
            
                r15.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x0286, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x0288, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x027d, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x027e, code lost:
            
                r15 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x022b, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x0219, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x0209, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x021b, code lost:
            
                r8.close();
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x0225, code lost:
            
                r0 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x0221, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x0222, code lost:
            
                kotlin.ExceptionsKt.addSuppressed(r0, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x022c, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x022d, code lost:
            
                r2 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x0305, code lost:
            
                if (r1 != null) goto L185;
             */
            /* JADX WARN: Code restructure failed: missing block: B:182:0x0307, code lost:
            
                r1.close();
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:184:?, code lost:
            
                throw r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x030d, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:186:0x030e, code lost:
            
                kotlin.ExceptionsKt.addSuppressed(r2, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:187:0x0311, code lost:
            
                throw r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:?, code lost:
            
                throw r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:189:0x0230, code lost:
            
                r1 = r25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:191:0x02b5, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:192:0x02b6, code lost:
            
                r1 = r25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:194:0x02ba, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:196:0x02e6, code lost:
            
                r15.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:197:0x02e9, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:202:0x02c5, code lost:
            
                throw new java.io.IOException("unsupported zip: spanned");
             */
            /* JADX WARN: Code restructure failed: missing block: B:204:0x02c6, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
            
                r5 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r0, "!", 0, false, 6, (java.lang.Object) null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
            
                r8 = r15.v() & kotlin.UShort.MAX_VALUE;
                r13 = r15.v() & kotlin.UShort.MAX_VALUE;
                r0 = r15.v() & kotlin.UShort.MAX_VALUE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
            
                r25 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
            
                if (r0 != (r15.v() & kotlin.UShort.MAX_VALUE)) goto L204;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
            
                if (r8 != 0) goto L205;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
            
                if (r13 != 0) goto L206;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
            
                r15.skip(4);
                r22 = r15.P() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                r31 = r15.v() & kotlin.UShort.MAX_VALUE;
                r19 = new okio.internal.k(r0, r22, r31);
                r15.q(r31);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
            
                r15.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
            
                r11 = r11 - 20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0155, code lost:
            
                if (r11 <= r17) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
            
                r1 = r25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
            
                r8 = okio.z.b(r1.x(r11));
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
            
                if (r8.P() != 117853008) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x016a, code lost:
            
                r9 = r8.P();
                r11 = r8.l();
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
            
                if (r8.P() != 1) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0179, code lost:
            
                if (r9 != 0) goto L210;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
            
                r9 = okio.z.b(r1.x(r11));
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
            
                r11 = r9.P();
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
            
                if (r11 != 101075792) goto L212;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
            
                r9.skip(12);
                r11 = r9.P();
                r12 = r9.P();
                r27 = r9.l();
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a3, code lost:
            
                if (r27 != r9.l()) goto L214;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
            
                if (r11 != 0) goto L215;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x01a7, code lost:
            
                if (r12 != 0) goto L216;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x01a9, code lost:
            
                r9.skip(8);
                r26 = new okio.internal.k(r27, r9.l(), r31);
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x01b9, code lost:
            
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x01bb, code lost:
            
                r9.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x01be, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0208, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01c5, code lost:
            
                r10 = r0;
                r19 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x01fa, code lost:
            
                r9.close();
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x0204, code lost:
            
                r0 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
            
                kotlin.ExceptionsKt.addSuppressed(r10, r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:123:0x024a A[Catch: all -> 0x027d, TRY_LEAVE, TryCatch #18 {all -> 0x027d, blocks: (B:120:0x0242, B:123:0x024a), top: B:119:0x0242 }] */
            /* JADX WARN: Removed duplicated region for block: B:145:0x0297 A[Catch: all -> 0x022c, TRY_LEAVE, TryCatch #11 {all -> 0x022c, blocks: (B:61:0x0159, B:118:0x0233, B:145:0x0297, B:152:0x02b4, B:155:0x0291, B:167:0x022b, B:177:0x0222, B:196:0x02e6, B:197:0x02e9, B:39:0x02ca, B:43:0x02dc, B:44:0x02e3, B:211:0x02ee, B:212:0x0304, B:173:0x021b, B:63:0x0161, B:65:0x016a, B:68:0x017b, B:86:0x0208, B:97:0x0201, B:109:0x020c, B:110:0x0211, B:112:0x0212, B:93:0x01fa, B:142:0x028a), top: B:60:0x0159, inners: #2, #8, #13 }] */
            /* JADX WARN: Removed duplicated region for block: B:151:0x02b4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:166:0x022b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x02ad  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x02b0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0208 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean startsWith$default;
                int lastIndexOf$default;
                Pair pair;
                Throwable th;
                k kVar;
                n nVar = n.this;
                ClassLoader classLoader2 = nVar.a;
                AbstractC1197l fileSystem = nVar.b;
                Enumeration<URL> resources = classLoader2.getResources("");
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                ArrayList<URL> list = Collections.list(resources);
                Intrinsics.checkNotNullExpressionValue(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    Intrinsics.checkNotNull(url);
                    Pair pair2 = !Intrinsics.areEqual(url.getProtocol(), Constants.FILE) ? null : TuplesKt.to(fileSystem, C.a.b(C.Companion, new File(url.toURI())));
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader2.getResources("META-INF/MANIFEST.MF");
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources2);
                Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    Intrinsics.checkNotNull(url2);
                    String url3 = url2.toString();
                    Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(url3, "jar:file:", false, 2, null);
                    if (startsWith$default && lastIndexOf$default != -1) {
                        C.a aVar = C.Companion;
                        String substring = url3.substring(4, lastIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        C zipPath = C.a.b(aVar, new File(URI.create(substring)));
                        int i = 1;
                        L predicate = new L(i);
                        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
                        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                        Intrinsics.checkNotNullParameter(predicate, "predicate");
                        AbstractC1195j openReadOnly = fileSystem.openReadOnly(zipPath);
                        try {
                            long size = openReadOnly.size() - 22;
                            long j = 0;
                            if (size < 0) {
                                throw new IOException("not a zip: size=" + openReadOnly.size());
                            }
                            long max = Math.max(size - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
                            while (true) {
                                F b = z.b(openReadOnly.x(size));
                                long j2 = j;
                                try {
                                    if (b.P() == 101010256) {
                                        break;
                                    }
                                    int i2 = i;
                                    AbstractC1195j abstractC1195j = openReadOnly;
                                    b.close();
                                    size--;
                                    if (size < max) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    openReadOnly = abstractC1195j;
                                    i = i2;
                                    j = j2;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            AbstractC1195j abstractC1195j2 = openReadOnly;
                        }
                    } else {
                        pair = null;
                    }
                    if (pair == null) {
                        arrayList2.add(pair);
                    }
                }
                return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
                k kVar2 = kVar;
                if (th != null) {
                }
            }
        });
    }

    public static String d(C child) {
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        return h.b(c, child, true).d(c).a.r();
    }

    @Override // okio.AbstractC1197l
    public final J appendingSink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC1197l
    public final void atomicMove(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC1197l
    public final C canonicalize(C child) {
        Intrinsics.checkNotNullParameter(child, "path");
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        return h.b(c, child, true);
    }

    @Override // okio.AbstractC1197l
    public final void createDirectory(C dir, boolean z) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC1197l
    public final void createSymlink(C source, C target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC1197l
    public final void delete(C path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC1197l
    public final List<C> list(C dir) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(dir, "dir");
        String d2 = d(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.c.getValue()) {
            AbstractC1197l abstractC1197l = (AbstractC1197l) pair.component1();
            C c = (C) pair.component2();
            try {
                List<C> list = abstractC1197l.list(c.e(d2));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (a.a((C) obj)) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(a.b((C) it.next(), c));
                }
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException(com.google.gson.internal.c.a(dir, "file not found: "));
    }

    @Override // okio.AbstractC1197l
    public final List<C> listOrNull(C dir) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(dir, "dir");
        String d2 = d(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.c.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            AbstractC1197l abstractC1197l = (AbstractC1197l) pair.component1();
            C c = (C) pair.component2();
            List<C> listOrNull = abstractC1197l.listOrNull(c.e(d2));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (a.a((C) obj)) {
                        arrayList2.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(a.b((C) it2.next(), c));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.AbstractC1197l
    public final C1196k metadataOrNull(C path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!a.a(path)) {
            return null;
        }
        String d2 = d(path);
        for (Pair pair : (List) this.c.getValue()) {
            C1196k metadataOrNull = ((AbstractC1197l) pair.component1()).metadataOrNull(((C) pair.component2()).e(d2));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.AbstractC1197l
    public final AbstractC1195j openReadOnly(C file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!a.a(file)) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(file, "file not found: "));
        }
        String d2 = d(file);
        for (Pair pair : (List) this.c.getValue()) {
            try {
                return ((AbstractC1197l) pair.component1()).openReadOnly(((C) pair.component2()).e(d2));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(com.google.gson.internal.c.a(file, "file not found: "));
    }

    @Override // okio.AbstractC1197l
    public final AbstractC1195j openReadWrite(C file, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.AbstractC1197l
    public final J sink(C file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.AbstractC1197l
    public final K source(C child) {
        Intrinsics.checkNotNullParameter(child, "file");
        if (!a.a(child)) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(child, "file not found: "));
        }
        C c = d;
        c.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        URL resource = this.a.getResource(h.b(c, child, false).d(c).a.r());
        if (resource == null) {
            throw new FileNotFoundException(com.google.gson.internal.c.a(child, "file not found: "));
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return z.d(inputStream);
    }
}
