package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.core.app.q;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class l {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f41945a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f41946b;

        /* renamed from: c, reason: collision with root package name */
        private final s[] f41947c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f41948d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41949e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public int f41950f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f41951g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f41952h;

        /* renamed from: androidx.core.app.l$a$a, reason: collision with other inner class name */
        public static final class C0763a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f41953a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f41954b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f41955c;

            /* renamed from: d, reason: collision with root package name */
            private final Bundle f41956d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f41957e;

            public C0763a(IconCompat iconCompat, SpannableStringBuilder spannableStringBuilder) {
                Bundle bundle = new Bundle();
                this.f41955c = true;
                this.f41957e = true;
                this.f41953a = iconCompat;
                this.f41954b = d.c(spannableStringBuilder);
                this.f41956d = bundle;
                this.f41955c = true;
                this.f41957e = true;
            }

            @NonNull
            public final a a() {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                return new a(this.f41953a, this.f41954b, null, this.f41956d, arrayList2.isEmpty() ? null : (s[]) arrayList2.toArray(new s[arrayList2.size()]), arrayList.isEmpty() ? null : (s[]) arrayList.toArray(new s[arrayList.size()]), this.f41955c, this.f41957e);
            }
        }

        public a(int i11, String str, PendingIntent pendingIntent) {
            this(i11 != 0 ? IconCompat.f("", null, i11) : null, str, pendingIntent);
        }

        public final boolean a() {
            return this.f41948d;
        }

        public final IconCompat b() {
            int i11;
            if (this.f41946b == null && (i11 = this.f41950f) != 0) {
                this.f41946b = IconCompat.f("", null, i11);
            }
            return this.f41946b;
        }

        public final s[] c() {
            return this.f41947c;
        }

        public a(IconCompat iconCompat, String str, PendingIntent pendingIntent) {
            this(iconCompat, str, pendingIntent, new Bundle(), null, null, true, true);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s[] sVarArr, s[] sVarArr2, boolean z11, boolean z12) {
            this.f41949e = true;
            this.f41946b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.f41950f = iconCompat.h();
            }
            this.f41951g = d.c(charSequence);
            this.f41952h = pendingIntent;
            this.f41945a = bundle == null ? new Bundle() : bundle;
            this.f41947c = sVarArr;
            this.f41948d = z11;
            this.f41949e = z12;
        }
    }

    public static class b extends h {

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f41958b;

        /* renamed from: c, reason: collision with root package name */
        private IconCompat f41959c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f41960d;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.l$b$b, reason: collision with other inner class name */
        private static class C0764b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z11) {
                bigPictureStyle.showBigPictureWhenCollapsed(z11);
            }
        }

        @Override // androidx.core.app.l.h
        public final void b(k kVar) {
            m mVar = (m) kVar;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(mVar.c()).setBigContentTitle(null);
            IconCompat iconCompat = this.f41958b;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0764b.a(bigContentTitle, this.f41958b.o(mVar.d()));
                } else if (iconCompat.j() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f41958b.g());
                }
            }
            if (this.f41960d) {
                if (this.f41959c == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f41959c.o(mVar.d()));
                }
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0764b.c(bigContentTitle, false);
                C0764b.b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.l.h
        @NonNull
        protected final String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @NonNull
        public final void d() {
            this.f41959c = null;
            this.f41960d = true;
        }

        @NonNull
        public final void e(Bitmap bitmap) {
            this.f41958b = bitmap == null ? null : IconCompat.e(bitmap);
        }
    }

    public static class c extends h {

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f41961b;

        @Override // androidx.core.app.l.h
        public final void b(k kVar) {
            new Notification.BigTextStyle(((m) kVar).c()).setBigContentTitle(null).bigText(this.f41961b);
        }

        @Override // androidx.core.app.l.h
        @NonNull
        protected final String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @NonNull
        public final void d(String str) {
            this.f41961b = d.c(str);
        }
    }

    public static class e extends h {

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @Override // androidx.core.app.l.h
        public final void a(@NonNull Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", 0);
            bundle.putBoolean("android.callIsVideo", false);
            bundle.putCharSequence("android.verificationText", null);
            bundle.putParcelable("android.answerIntent", null);
            bundle.putParcelable("android.declineIntent", null);
            bundle.putParcelable("android.hangUpIntent", null);
        }

        @Override // androidx.core.app.l.h
        public final void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(0));
                    return;
                }
                return;
            }
            Notification.Builder c11 = ((m) kVar).c();
            c11.setContentTitle(null);
            Bundle bundle = this.f42000a.f41982q;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f42000a.f41982q.getCharSequence("android.text");
            c11.setContentText(charSequence != null ? charSequence : null);
            a.b(c11, "call");
        }

        @Override // androidx.core.app.l.h
        @NonNull
        protected final String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }
    }

    public static class f extends h {

        static class a {
            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.l.h
        public final void b(k kVar) {
            ((m) kVar).c().setStyle(a.a());
        }

        @Override // androidx.core.app.l.h
        @NonNull
        protected final String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
    }

    public static class g extends h {

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f41992b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f41993c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private q f41994d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f41995e;

        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z11) {
                return messagingStyle.setGroupConversation(z11);
            }
        }

        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final String f41996a;

            /* renamed from: b, reason: collision with root package name */
            private final long f41997b;

            /* renamed from: c, reason: collision with root package name */
            private final q f41998c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f41999d = new Bundle();

            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j11, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j11, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j11, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j11, person);
                }
            }

            public d(String str, long j11, q qVar) {
                this.f41996a = str;
                this.f41997b = j11;
                this.f41998c = qVar;
            }

            @NonNull
            static Bundle[] a(@NonNull ArrayList arrayList) {
                Bundle[] bundleArr = new Bundle[arrayList.size()];
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    d dVar = (d) arrayList.get(i11);
                    dVar.getClass();
                    Bundle bundle = new Bundle();
                    String str = dVar.f41996a;
                    if (str != null) {
                        bundle.putCharSequence("text", str);
                    }
                    bundle.putLong("time", dVar.f41997b);
                    q qVar = dVar.f41998c;
                    if (qVar != null) {
                        bundle.putCharSequence("sender", qVar.f42028a);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle.putParcelable("sender_person", b.a(q.b.b(qVar)));
                        } else {
                            bundle.putBundle("person", qVar.b());
                        }
                    }
                    Bundle bundle2 = dVar.f41999d;
                    if (bundle2 != null) {
                        bundle.putBundle("extras", bundle2);
                    }
                    bundleArr[i11] = bundle;
                }
                return bundleArr;
            }

            @NonNull
            final Notification.MessagingStyle.Message b() {
                int i11 = Build.VERSION.SDK_INT;
                long j11 = this.f41997b;
                String str = this.f41996a;
                q qVar = this.f41998c;
                if (i11 >= 28) {
                    return b.b(str, j11, qVar != null ? q.b.b(qVar) : null);
                }
                return a.a(str, j11, qVar != null ? qVar.f42028a : null);
            }
        }

        public g(@NonNull q qVar) {
            if (TextUtils.isEmpty(qVar.f42028a)) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f41994d = qVar;
        }

        @Override // androidx.core.app.l.h
        public final void a(@NonNull Bundle bundle) {
            super.a(bundle);
            q qVar = this.f41994d;
            bundle.putCharSequence("android.selfDisplayName", qVar.f42028a);
            bundle.putBundle("android.messagingStyleUser", qVar.b());
            bundle.putCharSequence("android.hiddenConversationTitle", null);
            ArrayList arrayList = this.f41992b;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(arrayList));
            }
            ArrayList arrayList2 = this.f41993c;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(arrayList2));
            }
            Boolean bool = this.f41995e;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.l.h
        public final void b(k kVar) {
            Boolean bool;
            Notification.MessagingStyle b11;
            d dVar = this.f42000a;
            boolean z11 = false;
            if ((dVar == null || dVar.f41966a.getApplicationInfo().targetSdkVersion >= 28 || this.f41995e != null) && (bool = this.f41995e) != null) {
                z11 = bool.booleanValue();
            }
            this.f41995e = Boolean.valueOf(z11);
            int i11 = Build.VERSION.SDK_INT;
            q qVar = this.f41994d;
            if (i11 >= 28) {
                qVar.getClass();
                b11 = c.a(q.b.b(qVar));
            } else {
                b11 = a.b(qVar.f42028a);
            }
            Iterator it = this.f41992b.iterator();
            while (it.hasNext()) {
                a.a(b11, ((d) it.next()).b());
            }
            Iterator it2 = this.f41993c.iterator();
            while (it2.hasNext()) {
                b.a(b11, ((d) it2.next()).b());
            }
            if (this.f41995e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(b11, null);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(b11, this.f41995e.booleanValue());
            }
            b11.setBuilder(((m) kVar).c());
        }

        @Override // androidx.core.app.l.h
        @NonNull
        protected final String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @NonNull
        public final void d(String str, long j11, q qVar) {
            d dVar = new d(str, j11, qVar);
            ArrayList arrayList = this.f41992b;
            arrayList.add(dVar);
            if (arrayList.size() > 25) {
                arrayList.remove(0);
            }
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        protected d f42000a;

        public void a(@NonNull Bundle bundle) {
            String c11 = c();
            if (c11 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c11);
            }
        }

        public abstract void b(k kVar);

        protected abstract String c();
    }

    public static Bundle a(@NonNull Notification notification) {
        return notification.extras;
    }

    public static class d {

        /* renamed from: A, reason: collision with root package name */
        Notification f41962A;

        /* renamed from: B, reason: collision with root package name */
        boolean f41963B;

        /* renamed from: C, reason: collision with root package name */
        Icon f41964C;

        /* renamed from: D, reason: collision with root package name */
        @Deprecated
        public ArrayList<String> f41965D;

        /* renamed from: a, reason: collision with root package name */
        public Context f41966a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f41967b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public ArrayList<q> f41968c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f41969d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f41970e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f41971f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f41972g;

        /* renamed from: h, reason: collision with root package name */
        IconCompat f41973h;

        /* renamed from: i, reason: collision with root package name */
        int f41974i;

        /* renamed from: j, reason: collision with root package name */
        int f41975j;

        /* renamed from: k, reason: collision with root package name */
        boolean f41976k;

        /* renamed from: l, reason: collision with root package name */
        h f41977l;

        /* renamed from: m, reason: collision with root package name */
        String f41978m;

        /* renamed from: n, reason: collision with root package name */
        boolean f41979n;

        /* renamed from: o, reason: collision with root package name */
        boolean f41980o;

        /* renamed from: p, reason: collision with root package name */
        String f41981p;

        /* renamed from: q, reason: collision with root package name */
        Bundle f41982q;

        /* renamed from: r, reason: collision with root package name */
        int f41983r;

        /* renamed from: s, reason: collision with root package name */
        int f41984s;

        /* renamed from: t, reason: collision with root package name */
        RemoteViews f41985t;

        /* renamed from: u, reason: collision with root package name */
        RemoteViews f41986u;

        /* renamed from: v, reason: collision with root package name */
        String f41987v;

        /* renamed from: w, reason: collision with root package name */
        String f41988w;

        /* renamed from: x, reason: collision with root package name */
        androidx.core.content.b f41989x;

        /* renamed from: y, reason: collision with root package name */
        long f41990y;

        /* renamed from: z, reason: collision with root package name */
        boolean f41991z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i11) {
                return builder.setContentType(i11);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i11) {
                return builder.setLegacyStreamType(i11);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i11) {
                return builder.setUsage(i11);
            }
        }

        public d(@NonNull Context context, @NonNull String str) {
            this.f41967b = new ArrayList<>();
            this.f41968c = new ArrayList<>();
            this.f41969d = new ArrayList<>();
            this.f41976k = true;
            this.f41980o = false;
            this.f41983r = 0;
            this.f41984s = 0;
            Notification notification = new Notification();
            this.f41962A = notification;
            this.f41966a = context;
            this.f41987v = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.f41975j = 0;
            this.f41965D = new ArrayList<>();
            this.f41991z = true;
        }

        protected static CharSequence c(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void o(int i11, boolean z11) {
            Notification notification = this.f41962A;
            if (z11) {
                notification.flags = i11 | notification.flags;
            } else {
                notification.flags = (~i11) & notification.flags;
            }
        }

        @NonNull
        public final void A(boolean z11) {
            this.f41976k = z11;
        }

        @NonNull
        public final void B() {
            this.f41963B = true;
        }

        @NonNull
        public final void C(int i11) {
            this.f41962A.icon = i11;
        }

        @NonNull
        public final void D(@NonNull IconCompat iconCompat) {
            this.f41964C = iconCompat.o(this.f41966a);
        }

        @NonNull
        public final void E(Uri uri) {
            Notification notification = this.f41962A;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = a.a(a.e(a.c(a.b(), 4), 5));
        }

        @NonNull
        public final void F(h hVar) {
            if (this.f41977l != hVar) {
                this.f41977l = hVar;
                if (hVar == null || hVar.f42000a == this) {
                    return;
                }
                hVar.f42000a = this;
                F(hVar);
            }
        }

        @NonNull
        public final void G(String str) {
            this.f41962A.tickerText = c(str);
        }

        @NonNull
        public final void H(long j11) {
            this.f41990y = j11;
        }

        @NonNull
        public final void I(long[] jArr) {
            this.f41962A.vibrate = jArr;
        }

        @NonNull
        public final void J(int i11) {
            this.f41984s = i11;
        }

        @NonNull
        public final void K(long j11) {
            this.f41962A.when = j11;
        }

        @NonNull
        public final void a(int i11, String str, PendingIntent pendingIntent) {
            this.f41967b.add(new a(i11, str, pendingIntent));
        }

        @NonNull
        public final Notification b() {
            return new m(this).b();
        }

        @NonNull
        public final void d(boolean z11) {
            o(16, z11);
        }

        @NonNull
        public final void e(String str) {
            this.f41981p = str;
        }

        @NonNull
        public final void f(@NonNull String str) {
            this.f41987v = str;
        }

        @NonNull
        public final void g(int i11) {
            this.f41983r = i11;
        }

        @NonNull
        public final void h(PendingIntent pendingIntent) {
            this.f41972g = pendingIntent;
        }

        @NonNull
        public final void i(String str) {
            this.f41971f = c(str);
        }

        @NonNull
        public final void j(CharSequence charSequence) {
            this.f41970e = c(charSequence);
        }

        @NonNull
        public final void k(RemoteViews remoteViews) {
            this.f41986u = remoteViews;
        }

        @NonNull
        public final void l(RemoteViews remoteViews) {
            this.f41985t = remoteViews;
        }

        @NonNull
        public final void m(int i11) {
            Notification notification = this.f41962A;
            notification.defaults = i11;
            if ((i11 & 4) != 0) {
                notification.flags |= 1;
            }
        }

        @NonNull
        public final void n(PendingIntent pendingIntent) {
            this.f41962A.deleteIntent = pendingIntent;
        }

        @NonNull
        public final void p(String str) {
            this.f41978m = str;
        }

        @NonNull
        public final void q() {
            this.f41979n = true;
        }

        @NonNull
        public final void r() {
            this.f41973h = null;
        }

        @NonNull
        public final void s(Bitmap bitmap) {
            IconCompat e11;
            if (bitmap == null) {
                e11 = null;
            } else {
                if (Build.VERSION.SDK_INT < 27) {
                    Resources resources = this.f41966a.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                    if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                        bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                    }
                }
                e11 = IconCompat.e(bitmap);
            }
            this.f41973h = e11;
        }

        @NonNull
        public final void t(int i11, int i12, int i13) {
            Notification notification = this.f41962A;
            notification.ledARGB = i11;
            notification.ledOnMS = i12;
            notification.ledOffMS = i13;
            notification.flags = ((i12 == 0 || i13 == 0) ? 0 : 1) | (notification.flags & (-2));
        }

        @NonNull
        public final void u(boolean z11) {
            this.f41980o = z11;
        }

        @NonNull
        public final void v(int i11) {
            this.f41974i = i11;
        }

        @NonNull
        public final void w(boolean z11) {
            o(2, z11);
        }

        @NonNull
        public final void x() {
            o(8, true);
        }

        @NonNull
        public final void y(int i11) {
            this.f41975j = i11;
        }

        @NonNull
        public final void z(androidx.core.content.pm.f fVar) {
            this.f41988w = fVar.a();
            if (this.f41989x == null) {
                if (fVar.b() != null) {
                    this.f41989x = fVar.b();
                } else if (fVar.a() != null) {
                    this.f41989x = new androidx.core.content.b(fVar.a());
                }
            }
            if (this.f41970e == null) {
                j(fVar.c());
            }
        }

        @Deprecated
        public d(@NonNull Context context) {
            this(context, null);
        }
    }
}
