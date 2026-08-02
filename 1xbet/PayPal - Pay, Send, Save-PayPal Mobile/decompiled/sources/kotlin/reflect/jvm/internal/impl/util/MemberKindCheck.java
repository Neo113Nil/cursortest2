package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class MemberKindCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    private final java.lang.String getHighSpeedVideoSizes;

    public static final class MemberOrExtension extends kotlin.reflect.jvm.internal.impl.util.MemberKindCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension INSTANCE = new kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    private MemberKindCheck(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public java.lang.String getDescription() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public /* bridge */ java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        return kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    public static final class Member extends kotlin.reflect.jvm.internal.impl.util.MemberKindCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member INSTANCE = new kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member();

        private Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }

    public /* synthetic */ MemberKindCheck(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
