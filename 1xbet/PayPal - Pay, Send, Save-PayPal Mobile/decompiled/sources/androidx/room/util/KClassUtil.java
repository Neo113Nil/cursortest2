package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Ljava/lang/Class;", "klass", "", "suffix", "findAndInstantiateDatabaseImpl", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassUtil {
    public static /* synthetic */ java.lang.Object findAndInstantiateDatabaseImpl$default(java.lang.Class cls, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }

    public static final <T, C> T findAndInstantiateDatabaseImpl(java.lang.Class<C> cls, java.lang.String str) {
        java.lang.String str2;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Package r1 = cls.getPackage();
        if (r1 == null || (str2 = r1.getName()) == null) {
            str2 = "";
        }
        java.lang.String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(canonicalName);
        if (str2.length() != 0) {
            canonicalName = canonicalName.substring(str2.length() + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "");
        }
        java.lang.String str3 = canonicalName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.replace$default(str3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, '_', false, 4, (java.lang.Object) null));
        sb.append(str);
        java.lang.String obj2 = sb.toString();
        try {
            if (str2.length() == 0) {
                obj = obj2;
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb2.append(obj2);
                obj = sb2.toString();
            }
            java.lang.Class<?> cls2 = java.lang.Class.forName(obj, true, cls.getClassLoader());
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls2, "");
            return (T) cls2.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(obj2);
            sb3.append(" does not exist. Is Room annotation processor correctly configured?");
            throw new java.lang.RuntimeException(sb3.toString(), e);
        } catch (java.lang.IllegalAccessException e2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Cannot access the constructor ");
            sb4.append(cls.getCanonicalName());
            throw new java.lang.RuntimeException(sb4.toString(), e2);
        } catch (java.lang.InstantiationException e3) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new java.lang.RuntimeException(sb5.toString(), e3);
        }
    }
}
