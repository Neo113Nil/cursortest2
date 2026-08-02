package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import java.util.Objects;

/* renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5311d {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final f f42276a;

    /* renamed from: androidx.core.view.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final c f42277a;

        public a(@NonNull ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f42277a = new b(clipData, i11);
                return;
            }
            C0775d c0775d = new C0775d();
            c0775d.f42279a = clipData;
            c0775d.f42280b = i11;
            this.f42277a = c0775d;
        }

        @NonNull
        public final C5311d a() {
            return this.f42277a.build();
        }

        @NonNull
        public final void b(Bundle bundle) {
            this.f42277a.setExtras(bundle);
        }

        @NonNull
        public final void c(int i11) {
            this.f42277a.b(i11);
        }

        @NonNull
        public final void d(Uri uri) {
            this.f42277a.a(uri);
        }
    }

    /* renamed from: androidx.core.view.d$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final ContentInfo.Builder f42278a;

        b(@NonNull ClipData clipData, int i11) {
            this.f42278a = C5321i.a(clipData, i11);
        }

        @Override // androidx.core.view.C5311d.c
        public final void a(Uri uri) {
            this.f42278a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C5311d.c
        public final void b(int i11) {
            this.f42278a.setFlags(i11);
        }

        @Override // androidx.core.view.C5311d.c
        @NonNull
        public final C5311d build() {
            ContentInfo build;
            build = this.f42278a.build();
            return new C5311d(new e(build));
        }

        @Override // androidx.core.view.C5311d.c
        public final void setExtras(Bundle bundle) {
            this.f42278a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i11);

        @NonNull
        C5311d build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0775d implements c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        ClipData f42279a;

        /* renamed from: b, reason: collision with root package name */
        int f42280b;

        /* renamed from: c, reason: collision with root package name */
        int f42281c;

        /* renamed from: d, reason: collision with root package name */
        Uri f42282d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f42283e;

        @Override // androidx.core.view.C5311d.c
        public final void a(Uri uri) {
            this.f42282d = uri;
        }

        @Override // androidx.core.view.C5311d.c
        public final void b(int i11) {
            this.f42281c = i11;
        }

        @Override // androidx.core.view.C5311d.c
        @NonNull
        public final C5311d build() {
            return new C5311d(new g(this));
        }

        @Override // androidx.core.view.C5311d.c
        public final void setExtras(Bundle bundle) {
            this.f42283e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d$e */
    static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final ContentInfo f42284a;

        e(@NonNull ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f42284a = C5309c.a(contentInfo);
        }

        @Override // androidx.core.view.C5311d.f
        @NonNull
        public final ClipData a() {
            ClipData clip;
            clip = this.f42284a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C5311d.f
        public final int e() {
            int source;
            source = this.f42284a.getSource();
            return source;
        }

        @Override // androidx.core.view.C5311d.f
        @NonNull
        public final ContentInfo f() {
            return this.f42284a;
        }

        @Override // androidx.core.view.C5311d.f
        public final int getFlags() {
            int flags;
            flags = this.f42284a.getFlags();
            return flags;
        }

        @NonNull
        public final String toString() {
            return "ContentInfoCompat{" + this.f42284a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.d$f */
    interface f {
        @NonNull
        ClipData a();

        int e();

        ContentInfo f();

        int getFlags();
    }

    /* renamed from: androidx.core.view.d$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final ClipData f42285a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42286b;

        /* renamed from: c, reason: collision with root package name */
        private final int f42287c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f42288d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f42289e;

        g(C0775d c0775d) {
            ClipData clipData = c0775d.f42279a;
            clipData.getClass();
            this.f42285a = clipData;
            int i11 = c0775d.f42280b;
            x2.i.c(i11, 0, 5, "source");
            this.f42286b = i11;
            int i12 = c0775d.f42281c;
            if ((i12 & 1) == i12) {
                this.f42287c = i12;
                this.f42288d = c0775d.f42282d;
                this.f42289e = c0775d.f42283e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i12) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.C5311d.f
        @NonNull
        public final ClipData a() {
            return this.f42285a;
        }

        @Override // androidx.core.view.C5311d.f
        public final int e() {
            return this.f42286b;
        }

        @Override // androidx.core.view.C5311d.f
        public final ContentInfo f() {
            return null;
        }

        @Override // androidx.core.view.C5311d.f
        public final int getFlags() {
            return this.f42287c;
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f42285a.getDescription());
            sb2.append(", source=");
            int i11 = this.f42286b;
            sb2.append(i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb2.append(", flags=");
            int i12 = this.f42287c;
            sb2.append((i12 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i12));
            Uri uri = this.f42288d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            return C.o0.c(sb2, this.f42289e != null ? ", hasExtras" : "", "}");
        }
    }

    C5311d(@NonNull f fVar) {
        this.f42276a = fVar;
    }

    @NonNull
    public final ClipData a() {
        return this.f42276a.a();
    }

    public final int b() {
        return this.f42276a.getFlags();
    }

    public final int c() {
        return this.f42276a.e();
    }

    @NonNull
    public final ContentInfo d() {
        ContentInfo f7 = this.f42276a.f();
        Objects.requireNonNull(f7);
        return C5309c.a(f7);
    }

    @NonNull
    public final String toString() {
        return this.f42276a.toString();
    }
}
