package androidx.core.content.pm;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.C5133b;
import androidx.core.app.q;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    Context f42053a;

    /* renamed from: b, reason: collision with root package name */
    String f42054b;

    /* renamed from: c, reason: collision with root package name */
    Intent[] f42055c;

    /* renamed from: d, reason: collision with root package name */
    String f42056d;

    /* renamed from: e, reason: collision with root package name */
    String f42057e;

    /* renamed from: f, reason: collision with root package name */
    String f42058f;

    /* renamed from: g, reason: collision with root package name */
    IconCompat f42059g;

    /* renamed from: h, reason: collision with root package name */
    q[] f42060h;

    /* renamed from: i, reason: collision with root package name */
    C5133b f42061i;

    /* renamed from: j, reason: collision with root package name */
    androidx.core.content.b f42062j;

    /* renamed from: k, reason: collision with root package name */
    boolean f42063k;

    /* renamed from: l, reason: collision with root package name */
    PersistableBundle f42064l;

    private static class a {
        static void a(@NonNull ShortcutInfo.Builder builder) {
            builder.setExcludedFromSurfaces(0);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f42065a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f42066b;

        public b(@NonNull Context context, @NonNull String str) {
            f fVar = new f();
            this.f42065a = fVar;
            fVar.f42053a = context;
            fVar.f42054b = str;
        }

        @NonNull
        public final f a() {
            f fVar = this.f42065a;
            if (TextUtils.isEmpty(fVar.f42056d)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = fVar.f42055c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f42066b) {
                if (fVar.f42062j == null) {
                    fVar.f42062j = new androidx.core.content.b(fVar.f42054b);
                }
                fVar.f42063k = true;
            }
            return fVar;
        }

        @NonNull
        public final void b(@NonNull Set set) {
            C5133b c5133b = new C5133b(0);
            c5133b.addAll(set);
            this.f42065a.f42061i = c5133b;
        }

        @NonNull
        public final void c(@NonNull String str) {
            this.f42065a.f42058f = str;
        }

        @NonNull
        public final void d(IconCompat iconCompat) {
            this.f42065a.f42059g = iconCompat;
        }

        @NonNull
        public final void e(@NonNull Intent intent) {
            this.f42065a.f42055c = new Intent[]{intent};
        }

        @NonNull
        public final void f() {
            this.f42066b = true;
        }

        @NonNull
        public final void g(@NonNull String str) {
            this.f42065a.f42057e = str;
        }

        @NonNull
        public final void h() {
            this.f42065a.f42063k = true;
        }

        @NonNull
        public final void i(@NonNull q qVar) {
            this.f42065a.f42060h = new q[]{qVar};
        }

        @NonNull
        public final void j(@NonNull String str) {
            this.f42065a.f42056d = str;
        }
    }

    f() {
    }

    @NonNull
    public final String a() {
        return this.f42054b;
    }

    public final androidx.core.content.b b() {
        return this.f42062j;
    }

    @NonNull
    public final CharSequence c() {
        return this.f42056d;
    }

    public final ShortcutInfo d() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f42053a, this.f42054b).setShortLabel(this.f42056d).setIntents(this.f42055c);
        IconCompat iconCompat = this.f42059g;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.o(this.f42053a));
        }
        if (!TextUtils.isEmpty(this.f42057e)) {
            intents.setLongLabel(this.f42057e);
        }
        if (!TextUtils.isEmpty(this.f42058f)) {
            intents.setDisabledMessage(this.f42058f);
        }
        C5133b c5133b = this.f42061i;
        if (c5133b != null) {
            intents.setCategories(c5133b);
        }
        int i11 = 0;
        intents.setRank(0);
        PersistableBundle persistableBundle = this.f42064l;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            q[] qVarArr = this.f42060h;
            if (qVarArr != null && qVarArr.length > 0) {
                int length = qVarArr.length;
                Person[] personArr = new Person[length];
                while (i11 < length) {
                    personArr[i11] = this.f42060h[i11].a();
                    i11++;
                }
                intents.setPersons(personArr);
            }
            androidx.core.content.b bVar = this.f42062j;
            if (bVar != null) {
                intents.setLocusId(bVar.b());
            }
            intents.setLongLived(this.f42063k);
        } else {
            if (this.f42064l == null) {
                this.f42064l = new PersistableBundle();
            }
            q[] qVarArr2 = this.f42060h;
            if (qVarArr2 != null && qVarArr2.length > 0) {
                this.f42064l.putInt("extraPersonCount", qVarArr2.length);
                while (i11 < this.f42060h.length) {
                    PersistableBundle persistableBundle2 = this.f42064l;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i12 = i11 + 1;
                    sb2.append(i12);
                    persistableBundle2.putPersistableBundle(sb2.toString(), this.f42060h[i11].c());
                    i11 = i12;
                }
            }
            androidx.core.content.b bVar2 = this.f42062j;
            if (bVar2 != null) {
                this.f42064l.putString("extraLocusId", bVar2.a());
            }
            this.f42064l.putBoolean("extraLongLived", this.f42063k);
            intents.setExtras(this.f42064l);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents);
        }
        return intents.build();
    }
}
