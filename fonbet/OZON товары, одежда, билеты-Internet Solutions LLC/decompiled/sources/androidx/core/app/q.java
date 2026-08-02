package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f42028a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f42029b;

    /* renamed from: c, reason: collision with root package name */
    String f42030c;

    /* renamed from: d, reason: collision with root package name */
    String f42031d;

    /* renamed from: e, reason: collision with root package name */
    boolean f42032e;

    /* renamed from: f, reason: collision with root package name */
    boolean f42033f;

    static class a {
        static q a(PersistableBundle persistableBundle) {
            String string = persistableBundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String string2 = persistableBundle.getString("uri");
            String string3 = persistableBundle.getString("key");
            boolean z11 = persistableBundle.getBoolean("isBot");
            boolean z12 = persistableBundle.getBoolean("isImportant");
            q qVar = new q();
            qVar.f42028a = string;
            qVar.f42029b = null;
            qVar.f42030c = string2;
            qVar.f42031d = string3;
            qVar.f42032e = z11;
            qVar.f42033f = z12;
            return qVar;
        }

        static PersistableBundle b(q qVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = qVar.f42028a;
            persistableBundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", qVar.f42030c);
            persistableBundle.putString("key", qVar.f42031d);
            persistableBundle.putBoolean("isBot", qVar.f42032e);
            persistableBundle.putBoolean("isImportant", qVar.f42033f);
            return persistableBundle;
        }
    }

    static class b {
        static q a(Person person) {
            CharSequence name = person.getName();
            IconCompat b11 = person.getIcon() != null ? IconCompat.b(person.getIcon()) : null;
            String uri = person.getUri();
            String key = person.getKey();
            boolean isBot = person.isBot();
            boolean isImportant = person.isImportant();
            q qVar = new q();
            qVar.f42028a = name;
            qVar.f42029b = b11;
            qVar.f42030c = uri;
            qVar.f42031d = key;
            qVar.f42032e = isBot;
            qVar.f42033f = isImportant;
            return qVar;
        }

        static Person b(q qVar) {
            Person.Builder name = new Person.Builder().setName(qVar.f42028a);
            IconCompat iconCompat = qVar.f42029b;
            return name.setIcon(iconCompat != null ? iconCompat.n() : null).setUri(qVar.f42030c).setKey(qVar.f42031d).setBot(qVar.f42032e).setImportant(qVar.f42033f).build();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        String f42034a;

        /* renamed from: b, reason: collision with root package name */
        IconCompat f42035b;

        @NonNull
        public final q a() {
            q qVar = new q();
            qVar.f42028a = this.f42034a;
            qVar.f42029b = this.f42035b;
            qVar.f42030c = null;
            qVar.f42031d = null;
            qVar.f42032e = false;
            qVar.f42033f = false;
            return qVar;
        }

        @NonNull
        public final void b(IconCompat iconCompat) {
            this.f42035b = iconCompat;
        }

        @NonNull
        public final void c(String str) {
            this.f42034a = str;
        }
    }

    @NonNull
    public final Person a() {
        return b.b(this);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f42028a);
        IconCompat iconCompat = this.f42029b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f42030c);
        bundle.putString("key", this.f42031d);
        bundle.putBoolean("isBot", this.f42032e);
        bundle.putBoolean("isImportant", this.f42033f);
        return bundle;
    }

    @NonNull
    public final PersistableBundle c() {
        return a.b(this);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.f42031d;
        String str2 = qVar.f42031d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f42028a), Objects.toString(qVar.f42028a)) && Objects.equals(this.f42030c, qVar.f42030c) && Boolean.valueOf(this.f42032e).equals(Boolean.valueOf(qVar.f42032e)) && Boolean.valueOf(this.f42033f).equals(Boolean.valueOf(qVar.f42033f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f42031d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f42028a, this.f42030c, Boolean.valueOf(this.f42032e), Boolean.valueOf(this.f42033f));
    }
}
