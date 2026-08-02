package B4;

import B4.b0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@b0.a("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LB4/a;", "LB4/b0;", "LB4/a$a;", "a", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C2572a extends b0<C0063a> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f2599c;

    /* renamed from: d, reason: collision with root package name */
    private final Activity f2600d;

    /* renamed from: B4.a$a, reason: collision with other inner class name */
    public static class C0063a extends H {

        /* renamed from: l, reason: collision with root package name */
        private Intent f2601l;

        /* renamed from: m, reason: collision with root package name */
        private String f2602m;

        public C0063a() {
            throw null;
        }

        private static String C(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            return kotlin.text.h.X(str, "${applicationId}", packageName, false);
        }

        public final String A() {
            return this.f2602m;
        }

        public final Intent B() {
            return this.f2601l;
        }

        @Override // B4.H
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof C0063a) && super.equals(obj)) {
                Intent intent = this.f2601l;
                if ((intent != null ? intent.filterEquals(((C0063a) obj).f2601l) : ((C0063a) obj).f2601l == null) && Intrinsics.d(this.f2602m, ((C0063a) obj).f2602m)) {
                    return true;
                }
            }
            return false;
        }

        @Override // B4.H
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f2601l;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f2602m;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // B4.H
        public final void t(@NotNull Context context, @NotNull AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.t(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, g0.f2632a);
            Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            String C11 = C(context, obtainAttributes.getString(4));
            if (this.f2601l == null) {
                this.f2601l = new Intent();
            }
            Intent intent = this.f2601l;
            Intrinsics.f(intent);
            intent.setPackage(C11);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                ComponentName componentName = new ComponentName(context, string);
                if (this.f2601l == null) {
                    this.f2601l = new Intent();
                }
                Intent intent2 = this.f2601l;
                Intrinsics.f(intent2);
                intent2.setComponent(componentName);
            }
            String string2 = obtainAttributes.getString(1);
            if (this.f2601l == null) {
                this.f2601l = new Intent();
            }
            Intent intent3 = this.f2601l;
            Intrinsics.f(intent3);
            intent3.setAction(string2);
            String C12 = C(context, obtainAttributes.getString(2));
            if (C12 != null) {
                Uri parse = Uri.parse(C12);
                if (this.f2601l == null) {
                    this.f2601l = new Intent();
                }
                Intent intent4 = this.f2601l;
                Intrinsics.f(intent4);
                intent4.setData(parse);
            }
            this.f2602m = C(context, obtainAttributes.getString(3));
            obtainAttributes.recycle();
        }

        @Override // B4.H
        @NotNull
        public final String toString() {
            Intent intent = this.f2601l;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.f2601l;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb2.append(" action=");
                    sb2.append(action);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            return sb3;
        }
    }

    /* renamed from: B4.a$b */
    static final class b extends AbstractC7737t implements Function1<Context, Context> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f2603b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Context invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C2572a(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2599c = context;
        Iterator it = kotlin.sequences.l.q(context, b.f2603b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2600d = (Activity) obj;
    }

    @Override // B4.b0
    public final C0063a a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new C0063a(this);
    }

    @Override // B4.b0
    public final H d(H h11, Bundle bundle, S s11) {
        Intent intent;
        int intExtra;
        C0063a destination = (C0063a) h11;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.B() == null) {
            throw new IllegalStateException(("Destination " + destination.m() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.B());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String A11 = destination.A();
            if (A11 != null && A11.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(A11);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + A11);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f2600d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (s11 != null && s11.g()) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.m());
        Context context = this.f2599c;
        Resources resources = context.getResources();
        if (s11 != null) {
            int c11 = s11.c();
            int d11 = s11.d();
            if ((c11 <= 0 || !Intrinsics.d(resources.getResourceTypeName(c11), "animator")) && (d11 <= 0 || !Intrinsics.d(resources.getResourceTypeName(d11), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c11);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d11);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c11) + " and popExit resource " + resources.getResourceName(d11) + " when launching " + destination);
            }
        }
        context.startActivity(intent2);
        if (s11 == null || activity == null) {
            return null;
        }
        int a11 = s11.a();
        int b11 = s11.b();
        if ((a11 <= 0 || !Intrinsics.d(resources.getResourceTypeName(a11), "animator")) && (b11 <= 0 || !Intrinsics.d(resources.getResourceTypeName(b11), "animator"))) {
            if (a11 < 0 && b11 < 0) {
                return null;
            }
            if (a11 < 0) {
                a11 = 0;
            }
            activity.overridePendingTransition(a11, b11 >= 0 ? b11 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a11) + " and exit resource " + resources.getResourceName(b11) + "when launching " + destination);
        return null;
    }

    @Override // B4.b0
    public final boolean k() {
        Activity activity = this.f2600d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
