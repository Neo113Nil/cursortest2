package Lm0;

import Sc.InterfaceC3999a;
import V.e;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f17149a = new b(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ArrayList<c> f17150b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static volatile c[] f17151c = new c[0];

    /* renamed from: Lm0.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0333a extends c {

        /* renamed from: b, reason: collision with root package name */
        private static final Pattern f17152b = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f17153a = C7714v.b0(a.class.getName(), b.class.getName(), c.class.getName(), C0333a.class.getName());

        @Override // Lm0.a.c
        public final String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement element : stackTrace) {
                if (!this.f17153a.contains(element.getClassName())) {
                    Intrinsics.checkNotNullParameter(element, "element");
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    String j02 = h.j0('.', className, className);
                    Matcher matcher = f17152b.matcher(j02);
                    if (matcher.find()) {
                        j02 = matcher.replaceAll("");
                        Intrinsics.checkNotNullExpressionValue(j02, "m.replaceAll(\"\")");
                    }
                    j02.getClass();
                    return j02;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // Lm0.a.c
        protected void log(int i11, String str, @NotNull String message, Throwable th2) {
            int min;
            Intrinsics.checkNotNullParameter(message, "message");
            if (message.length() < 4000) {
                if (i11 == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i11, str, message);
                    return;
                }
            }
            int length = message.length();
            int i12 = 0;
            while (i12 < length) {
                int I11 = h.I('\n', i12, 4, message);
                if (I11 == -1) {
                    I11 = length;
                }
                while (true) {
                    min = Math.min(I11, i12 + 4000);
                    String substring = message.substring(i12, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i11 == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i11, str, substring);
                    }
                    if (min >= I11) {
                        break;
                    } else {
                        i12 = min;
                    }
                }
                i12 = min + 1;
            }
        }
    }

    public static final class b extends c {
        public /* synthetic */ b(int i11) {
            this();
        }

        public final void a(@NotNull c tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            if (tree == this) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (a.f17150b) {
                a.f17150b.add(tree);
                Object[] array = a.f17150b.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f17151c = (c[]) array;
                Unit unit = Unit.f71690a;
            }
        }

        @NotNull
        public final void b(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            c[] cVarArr = a.f17151c;
            int length = cVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                c cVar = cVarArr[i11];
                i11++;
                cVar.getExplicitTag$timber_release().set(tag);
            }
        }

        @Override // Lm0.a.c
        public final void d(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Lm0.a.c
        public final void e(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.e(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Lm0.a.c
        public final void i(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.i(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Lm0.a.c
        protected final void log(int i11, String str, @NotNull String message, Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            throw new AssertionError();
        }

        @Override // Lm0.a.c
        public final void w(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.w(str, Arrays.copyOf(args, args.length));
            }
        }

        private b() {
        }

        @Override // Lm0.a.c
        public final void d(Throwable th2) {
            for (c cVar : a.f17151c) {
                cVar.d(th2);
            }
        }

        @Override // Lm0.a.c
        public final void e(Throwable th2, String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.e(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Lm0.a.c
        public final void i(Throwable th2, String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.i(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Lm0.a.c
        public final void w(Throwable th2, String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (c cVar : a.f17151c) {
                cVar.w(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // Lm0.a.c
        public final void e(Throwable th2) {
            for (c cVar : a.f17151c) {
                cVar.e(th2);
            }
        }

        @Override // Lm0.a.c
        public final void i(Throwable th2) {
            for (c cVar : a.f17151c) {
                cVar.i(th2);
            }
        }

        @Override // Lm0.a.c
        public final void w(Throwable th2) {
            for (c cVar : a.f17151c) {
                cVar.w(th2);
            }
        }
    }

    public static abstract class c {

        @NotNull
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void prepareLog(int i11, Throwable th2, String str, Object... objArr) {
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i11)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = formatMessage(str, objArr);
                    }
                    if (th2 != null) {
                        str = ((Object) str) + '\n' + getStackTraceString(th2);
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str = getStackTraceString(th2);
                }
                log(i11, tag$timber_release, str, th2);
            }
        }

        public void d(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void e(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, null, str, Arrays.copyOf(args, args.length));
        }

        @NotNull
        protected String formatMessage(@NotNull String message, @NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(args, "args");
            Object[] copyOf = Arrays.copyOf(args, args.length);
            return e.b(copyOf, copyOf.length, message, "java.lang.String.format(this, *args)");
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, null, str, Arrays.copyOf(args, args.length));
        }

        @InterfaceC3999a
        protected boolean isLoggable(int i11) {
            return true;
        }

        protected abstract void log(int i11, String str, @NotNull String str2, Throwable th2);

        public void w(String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th2) {
            prepareLog(3, th2, null, new Object[0]);
        }

        public void e(Throwable th2, String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, th2, str, Arrays.copyOf(args, args.length));
        }

        public void i(Throwable th2, String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, th2, str, Arrays.copyOf(args, args.length));
        }

        protected boolean isLoggable(String str, int i11) {
            return isLoggable(i11);
        }

        public void w(Throwable th2, String str, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, th2, str, Arrays.copyOf(args, args.length));
        }

        public void e(Throwable th2) {
            prepareLog(6, th2, null, new Object[0]);
        }

        public void i(Throwable th2) {
            prepareLog(4, th2, null, new Object[0]);
        }

        public void w(Throwable th2) {
            prepareLog(5, th2, null, new Object[0]);
        }
    }

    private a() {
        throw new AssertionError();
    }

    public static final void d(@NotNull c... trees) {
        b bVar = f17149a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(trees, "trees");
        int length = trees.length;
        int i11 = 0;
        while (i11 < length) {
            c cVar = trees[i11];
            i11++;
            if (cVar == null) {
                throw new IllegalArgumentException("trees contained null");
            }
            if (cVar == bVar) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
        }
        ArrayList<c> arrayList = f17150b;
        synchronized (arrayList) {
            Collections.addAll(arrayList, Arrays.copyOf(trees, trees.length));
            Object[] array = arrayList.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            f17151c = (c[]) array;
            Unit unit = Unit.f71690a;
        }
    }
}
