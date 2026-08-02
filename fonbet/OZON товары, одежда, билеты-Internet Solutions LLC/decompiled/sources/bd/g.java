package bd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC7695b;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lbd/g;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements Sequence<File> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f55930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FileWalkDirection f55931b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<File, Boolean> f55932c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<File, Unit> f55933d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2<File, IOException, Unit> f55934e;

    /* renamed from: f, reason: collision with root package name */
    private final int f55935f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends AbstractC7695b<File> {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayDeque<c> f55936c;

        private final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f55938b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f55939c;

            /* renamed from: d, reason: collision with root package name */
            private int f55940d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f55941e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f55942f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f55942f = bVar;
            }

            @Override // bd.g.c
            public final File b() {
                boolean z11 = this.f55941e;
                b bVar = this.f55942f;
                if (!z11 && this.f55939c == null) {
                    Function1 function1 = g.this.f55932c;
                    if (function1 == null || ((Boolean) function1.invoke(a())).booleanValue()) {
                        File[] listFiles = a().listFiles();
                        this.f55939c = listFiles;
                        if (listFiles == null) {
                            Function2 function2 = g.this.f55934e;
                            if (function2 != null) {
                                function2.invoke(a(), new C5651a(a(), null, "Cannot list files in a directory", 2, null));
                            }
                            this.f55941e = true;
                        }
                    }
                    return null;
                }
                File[] fileArr = this.f55939c;
                if (fileArr != null && this.f55940d < fileArr.length) {
                    Intrinsics.f(fileArr);
                    int i11 = this.f55940d;
                    this.f55940d = i11 + 1;
                    return fileArr[i11];
                }
                if (!this.f55938b) {
                    this.f55938b = true;
                    return a();
                }
                Function1 function12 = g.this.f55933d;
                if (function12 != null) {
                    function12.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: bd.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        private final class C0837b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f55943b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0837b(@NotNull File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            }

            @Override // bd.g.c
            public final File b() {
                if (this.f55943b) {
                    return null;
                }
                this.f55943b = true;
                return a();
            }
        }

        /* loaded from: classes10.dex */
        private final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f55944b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f55945c;

            /* renamed from: d, reason: collision with root package name */
            private int f55946d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f55947e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f55947e = bVar;
            }

            @Override // bd.g.c
            public final File b() {
                Function2 function2;
                boolean z11 = this.f55944b;
                b bVar = this.f55947e;
                if (z11) {
                    File[] fileArr = this.f55945c;
                    if (fileArr == null || this.f55946d < fileArr.length) {
                        if (fileArr == null) {
                            File[] listFiles = a().listFiles();
                            this.f55945c = listFiles;
                            if (listFiles == null && (function2 = g.this.f55934e) != null) {
                                function2.invoke(a(), new C5651a(a(), null, "Cannot list files in a directory", 2, null));
                            }
                            File[] fileArr2 = this.f55945c;
                            if (fileArr2 == null || fileArr2.length == 0) {
                                Function1 function1 = g.this.f55933d;
                                if (function1 != null) {
                                    function1.invoke(a());
                                }
                            }
                        }
                        File[] fileArr3 = this.f55945c;
                        Intrinsics.f(fileArr3);
                        int i11 = this.f55946d;
                        this.f55946d = i11 + 1;
                        return fileArr3[i11];
                    }
                    Function1 function12 = g.this.f55933d;
                    if (function12 != null) {
                        function12.invoke(a());
                        return null;
                    }
                } else {
                    Function1 function13 = g.this.f55932c;
                    if (function13 == null || ((Boolean) function13.invoke(a())).booleanValue()) {
                        this.f55944b = true;
                        return a();
                    }
                }
                return null;
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f55948a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f55948a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f55936c = arrayDeque;
            if (g.this.f55930a.isDirectory()) {
                arrayDeque.push(h(g.this.f55930a));
            } else if (g.this.f55930a.isFile()) {
                arrayDeque.push(new C0837b(g.this.f55930a));
            } else {
                c();
            }
        }

        private final a h(File file) {
            int i11 = d.f55948a[g.this.f55931b.ordinal()];
            if (i11 == 1) {
                return new c(this, file);
            }
            if (i11 == 2) {
                return new a(this, file);
            }
            throw new Sc.o();
        }

        @Override // kotlin.collections.AbstractC7695b
        protected final void b() {
            File file;
            File b11;
            while (true) {
                ArrayDeque<c> arrayDeque = this.f55936c;
                c peek = arrayDeque.peek();
                if (peek == null) {
                    file = null;
                    break;
                }
                b11 = peek.b();
                if (b11 == null) {
                    arrayDeque.pop();
                } else if (b11.equals(peek.a()) || !b11.isDirectory() || arrayDeque.size() >= g.this.f55935f) {
                    break;
                } else {
                    arrayDeque.push(h(b11));
                }
            }
            file = b11;
            if (file != null) {
                e(file);
            } else {
                c();
            }
        }
    }

    private static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final File f55949a;

        public c(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f55949a = root;
        }

        @NotNull
        public final File a() {
            return this.f55949a;
        }

        public abstract File b();
    }

    g(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i12 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection;
        i11 = (i12 & 32) != 0 ? Integer.MAX_VALUE : i11;
        this.f55930a = file;
        this.f55931b = fileWalkDirection;
        this.f55932c = function1;
        this.f55933d = function12;
        this.f55934e = function2;
        this.f55935f = i11;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<File> iterator() {
        return new b();
    }
}
