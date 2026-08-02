package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class DeclarationDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl implements kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor {
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;

    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getOriginal() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        super(annotations);
        if (annotations == null) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        this.getHighSpeedVideoFpsRangesFor = name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.getHighSpeedVideoFpsRangesFor;
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(2);
        }
        return name2;
    }

    public java.lang.String toString() {
        return toString(this);
    }

    public static java.lang.String toString(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(4);
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.render(declarationDescriptor));
            sb.append("[");
            sb.append(declarationDescriptor.getClass().getSimpleName());
            sb.append("@");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(declarationDescriptor)));
            sb.append("]");
            java.lang.String obj = sb.toString();
            if (obj == null) {
                getHighSpeedVideoFpsRangesFor(5);
            }
            return obj;
        } catch (java.lang.Throwable unused) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(declarationDescriptor.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(declarationDescriptor.getName());
            java.lang.String obj2 = sb2.toString();
            if (obj2 == null) {
                getHighSpeedVideoFpsRangesFor(6);
            }
            return obj2;
        }
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
