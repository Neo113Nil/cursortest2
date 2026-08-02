package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.collection.C5133b;
import androidx.core.app.l;
import androidx.core.app.q;
import androidx.core.app.s;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* loaded from: classes8.dex */
final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42001a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f42002b;

    /* renamed from: c, reason: collision with root package name */
    private final l.d f42003c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f42004d;

    /* renamed from: e, reason: collision with root package name */
    private int f42005e;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i11, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z11) {
            return builder.setGroupSummary(z11);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z11) {
            return builder.setLocalOnly(z11);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i11) {
            return builder.setColor(i11);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i11) {
            return builder.setVisibility(i11);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z11) {
            return builder.setAllowGeneratedReplies(z11);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i11) {
            return builder.setBadgeIconType(i11);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z11) {
            return builder.setColorized(z11);
        }

        static Notification.Builder d(Notification.Builder builder, int i11) {
            return builder.setGroupAlertBehavior(i11);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j11) {
            return builder.setTimeoutAfter(j11);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i11) {
            return builder.setSemanticAction(i11);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z11) {
            return builder.setAllowSystemGeneratedContextualActions(z11);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z11) {
            return builder.setContextual(z11);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z11) {
            return builder.setAuthenticationRequired(z11);
        }

        static Notification.Builder b(Notification.Builder builder, int i11) {
            return builder.setForegroundServiceBehavior(i11);
        }
    }

    m(l.d dVar) {
        int i11;
        ArrayList<q> arrayList;
        ArrayList<l.a> arrayList2;
        ArrayList<q> arrayList3;
        Bundle[] bundleArr;
        ArrayList<String> arrayList4;
        int i12 = 1;
        new ArrayList();
        this.f42004d = new Bundle();
        this.f42003c = dVar;
        Context context = dVar.f41966a;
        this.f42001a = context;
        Notification.Builder a11 = e.a(context, dVar.f41987v);
        this.f42002b = a11;
        Notification notification = dVar.f41962A;
        int i13 = 0;
        a11.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f41970e).setContentText(dVar.f41971f).setContentInfo(null).setContentIntent(dVar.f41972g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0).setNumber(dVar.f41974i).setProgress(0, 0, false);
        IconCompat iconCompat = dVar.f41973h;
        c.b(a11, iconCompat == null ? null : iconCompat.o(context));
        a11.setSubText(null).setUsesChronometer(false).setPriority(dVar.f41975j);
        l.h hVar = dVar.f41977l;
        if (hVar instanceof l.e) {
            l.e eVar = (l.e) hVar;
            int color = androidx.core.content.a.getColor(eVar.f42000a.f41966a, R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) eVar.f42000a.f41966a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = eVar.f42000a.f41966a;
            int i14 = IconCompat.f42131l;
            context2.getClass();
            l.a a12 = new l.a.C0763a(IconCompat.f(context2.getPackageName(), context2.getResources(), 2131231953), spannableStringBuilder).a();
            a12.f41945a.putBoolean("key_action_priority", true);
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(a12);
            ArrayList<l.a> arrayList6 = eVar.f42000a.f41967b;
            if (arrayList6 != null) {
                Iterator<l.a> it = arrayList6.iterator();
                int i15 = 2;
                while (it.hasNext()) {
                    l.a next = it.next();
                    next.getClass();
                    if (!next.f41945a.getBoolean("key_action_priority") && i15 > 1) {
                        arrayList5.add(next);
                        i15--;
                    }
                }
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                a((l.a) it2.next());
            }
        } else {
            Iterator<l.a> it3 = dVar.f41967b.iterator();
            while (it3.hasNext()) {
                a(it3.next());
            }
        }
        Bundle bundle = dVar.f41982q;
        if (bundle != null) {
            this.f42004d.putAll(bundle);
        }
        int i16 = Build.VERSION.SDK_INT;
        this.f42002b.setShowWhen(dVar.f41976k);
        a.i(this.f42002b, dVar.f41980o);
        a.g(this.f42002b, dVar.f41978m);
        a.j(this.f42002b, null);
        a.h(this.f42002b, dVar.f41979n);
        this.f42005e = 0;
        b.b(this.f42002b, dVar.f41981p);
        b.c(this.f42002b, dVar.f41983r);
        b.f(this.f42002b, dVar.f41984s);
        b.d(this.f42002b, null);
        b.e(this.f42002b, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList7 = dVar.f41965D;
        ArrayList<q> arrayList8 = dVar.f41968c;
        if (i16 < 28) {
            if (arrayList8 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList<>(arrayList8.size());
                Iterator<q> it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    q next2 = it4.next();
                    String str = next2.f42030c;
                    if (str == null) {
                        CharSequence charSequence = next2.f42028a;
                        if (charSequence != null) {
                            str = "name:" + ((Object) charSequence);
                        } else {
                            str = "";
                        }
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList4;
                } else {
                    C5133b c5133b = new C5133b(arrayList7.size() + arrayList4.size());
                    c5133b.addAll(arrayList4);
                    c5133b.addAll(arrayList7);
                    arrayList7 = new ArrayList<>(c5133b);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            Iterator<String> it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                b.a(this.f42002b, it5.next());
            }
        }
        ArrayList<l.a> arrayList9 = dVar.f41969d;
        if (arrayList9.size() > 0) {
            if (dVar.f41982q == null) {
                dVar.f41982q = new Bundle();
            }
            Bundle bundle2 = dVar.f41982q.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList9.size()) {
                String num = Integer.toString(i17);
                int i18 = i12;
                l.a aVar = arrayList9.get(i17);
                Bundle bundle5 = new Bundle();
                IconCompat b11 = aVar.b();
                bundle5.putInt("icon", b11 != null ? b11.h() : i13);
                bundle5.putCharSequence(SelectionItemFormDTO.TITLE_FIELD_NAME, aVar.f41951g);
                bundle5.putParcelable("actionIntent", aVar.f41952h);
                Bundle bundle6 = aVar.f41945a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", aVar.a());
                bundle5.putBundle("extras", bundle7);
                s[] c11 = aVar.c();
                if (c11 == null) {
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[c11.length];
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    int i19 = 0;
                    while (i19 < c11.length) {
                        s sVar = c11[i19];
                        int i21 = i19;
                        Bundle bundle8 = new Bundle();
                        sVar.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence("label", null);
                        bundle8.putCharSequenceArray("choices", null);
                        Bundle[] bundleArr3 = bundleArr2;
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr3[i21] = bundle8;
                        i19 = i21 + 1;
                        c11 = c11;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", aVar.f41949e);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(num, bundle5);
                i17++;
                i12 = i18;
                arrayList9 = arrayList2;
                arrayList8 = arrayList3;
                i13 = 0;
            }
            i11 = i12;
            arrayList = arrayList8;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (dVar.f41982q == null) {
                dVar.f41982q = new Bundle();
            }
            dVar.f41982q.putBundle("android.car.EXTENSIONS", bundle2);
            this.f42004d.putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            i11 = 1;
            arrayList = arrayList8;
        }
        int i22 = Build.VERSION.SDK_INT;
        Icon icon = dVar.f41964C;
        if (icon != null) {
            c.c(this.f42002b, icon);
        }
        this.f42002b.setExtras(dVar.f41982q);
        d.e(this.f42002b, null);
        RemoteViews remoteViews = dVar.f41985t;
        if (remoteViews != null) {
            d.c(this.f42002b, remoteViews);
        }
        RemoteViews remoteViews2 = dVar.f41986u;
        if (remoteViews2 != null) {
            d.b(this.f42002b, remoteViews2);
        }
        e.b(this.f42002b, 0);
        e.e(this.f42002b, null);
        e.f(this.f42002b, dVar.f41988w);
        e.g(this.f42002b, dVar.f41990y);
        e.d(this.f42002b, 0);
        if (!TextUtils.isEmpty(dVar.f41987v)) {
            this.f42002b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i22 >= 28) {
            Iterator<q> it6 = arrayList.iterator();
            while (it6.hasNext()) {
                q next3 = it6.next();
                Notification.Builder builder = this.f42002b;
                next3.getClass();
                f.a(builder, q.b.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            g.a(this.f42002b, dVar.f41991z);
            g.b(this.f42002b, null);
            androidx.core.content.b bVar = dVar.f41989x;
            if (bVar != null) {
                g.d(this.f42002b, bVar.b());
            }
        }
        if (dVar.f41963B) {
            if (this.f42003c.f41979n) {
                this.f42005e = 2;
            } else {
                this.f42005e = i11;
            }
            this.f42002b.setVibrate(null);
            this.f42002b.setSound(null);
            int i23 = notification.defaults & (-4);
            notification.defaults = i23;
            this.f42002b.setDefaults(i23);
            if (TextUtils.isEmpty(this.f42003c.f41978m)) {
                a.g(this.f42002b, "silent");
            }
            e.d(this.f42002b, this.f42005e);
        }
    }

    private void a(l.a aVar) {
        IconCompat b11 = aVar.b();
        RemoteInput[] remoteInputArr = null;
        Notification.Action.Builder a11 = c.a(b11 != null ? b11.n() : null, aVar.f41951g, aVar.f41952h);
        if (aVar.c() != null) {
            s[] c11 = aVar.c();
            if (c11 != null) {
                remoteInputArr = new RemoteInput[c11.length];
                for (int i11 = 0; i11 < c11.length; i11++) {
                    c11[i11].getClass();
                    RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        s.a.b(addExtras, 0);
                    }
                    remoteInputArr[i11] = addExtras.build();
                }
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                a.c(a11, remoteInput);
            }
        }
        Bundle bundle = aVar.f41945a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.a());
        int i12 = Build.VERSION.SDK_INT;
        d.a(a11, aVar.a());
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i12 >= 28) {
            f.b(a11, 0);
        }
        if (i12 >= 29) {
            g.c(a11, false);
        }
        if (i12 >= 31) {
            h.a(a11, false);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", aVar.f41949e);
        a.b(a11, bundle2);
        a.a(this.f42002b, a.d(a11));
    }

    public final Notification b() {
        Bundle bundle;
        l.d dVar = this.f42003c;
        l.h hVar = dVar.f41977l;
        if (hVar != null) {
            hVar.b(this);
        }
        Notification build = this.f42002b.build();
        RemoteViews remoteViews = dVar.f41985t;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (hVar != null) {
            dVar.f41977l.getClass();
        }
        if (hVar != null && (bundle = build.extras) != null) {
            hVar.a(bundle);
        }
        return build;
    }

    public final Notification.Builder c() {
        return this.f42002b;
    }

    final Context d() {
        return this.f42001a;
    }
}
