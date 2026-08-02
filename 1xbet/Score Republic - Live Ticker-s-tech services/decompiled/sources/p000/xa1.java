package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 implements hq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8875a;

    /* JADX INFO: renamed from: b */
    public final hq0 f8876b;

    public /* synthetic */ xa1(hq0 hq0Var, int i) {
        this.f8875a = i;
        this.f8876b = hq0Var;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo639a(Object obj) {
        switch (this.f8875a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        Uri uriFromFile;
        int i3 = this.f8875a;
        hq0 hq0Var = this.f8876b;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null || !hq0Var.mo639a(uriFromFile)) {
                    return null;
                }
                return hq0Var.mo640b(uriFromFile, i, i2, uu0Var);
            default:
                return hq0Var.mo640b(new z80((URL) obj), i, i2, uu0Var);
        }
    }
}
