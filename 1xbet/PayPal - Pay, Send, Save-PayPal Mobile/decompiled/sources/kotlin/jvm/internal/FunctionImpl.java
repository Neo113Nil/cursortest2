package kotlin.jvm.internal;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@java.lang.Deprecated
/* loaded from: classes3.dex */
public abstract class FunctionImpl implements kotlin.Function, java.io.Serializable, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function5, kotlin.jvm.functions.Function6, kotlin.jvm.functions.Function7, kotlin.jvm.functions.Function8, kotlin.jvm.functions.Function9, kotlin.jvm.functions.Function10, kotlin.jvm.functions.Function11, kotlin.jvm.functions.Function12, kotlin.jvm.functions.Function13, kotlin.jvm.functions.Function14, kotlin.jvm.functions.Function15, kotlin.jvm.functions.Function16, kotlin.jvm.functions.Function17, kotlin.jvm.functions.Function18, kotlin.jvm.functions.Function19, kotlin.jvm.functions.Function20, kotlin.jvm.functions.Function21, kotlin.jvm.functions.Function22 {
    public abstract int getArity();

    public java.lang.Object invokeVararg(java.lang.Object... objArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (getArity() == i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong function arity, expected: ");
        sb.append(i);
        sb.append(", actual: ");
        sb.append(getArity());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        getHighResolutionOutputSizeshNQ4ISI(0);
        return invokeVararg(new java.lang.Object[0]);
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        getHighResolutionOutputSizeshNQ4ISI(1);
        return invokeVararg(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        getHighResolutionOutputSizeshNQ4ISI(2);
        return invokeVararg(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        getHighResolutionOutputSizeshNQ4ISI(3);
        return invokeVararg(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        getHighResolutionOutputSizeshNQ4ISI(4);
        return invokeVararg(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        getHighResolutionOutputSizeshNQ4ISI(5);
        return invokeVararg(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        getHighResolutionOutputSizeshNQ4ISI(6);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        getHighResolutionOutputSizeshNQ4ISI(7);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.jvm.functions.Function8
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        getHighResolutionOutputSizeshNQ4ISI(8);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.jvm.functions.Function9
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
        getHighResolutionOutputSizeshNQ4ISI(9);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.jvm.functions.Function10
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        getHighResolutionOutputSizeshNQ4ISI(10);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function11
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
        getHighResolutionOutputSizeshNQ4ISI(11);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kotlin.jvm.functions.Function12
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        getHighResolutionOutputSizeshNQ4ISI(12);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13) {
        getHighResolutionOutputSizeshNQ4ISI(13);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.jvm.functions.Function14
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14) {
        getHighResolutionOutputSizeshNQ4ISI(14);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // kotlin.jvm.functions.Function15
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15) {
        getHighResolutionOutputSizeshNQ4ISI(15);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // kotlin.jvm.functions.Function16
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16) {
        getHighResolutionOutputSizeshNQ4ISI(16);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.jvm.functions.Function17
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17) {
        getHighResolutionOutputSizeshNQ4ISI(17);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // kotlin.jvm.functions.Function18
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18) {
        getHighResolutionOutputSizeshNQ4ISI(18);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // kotlin.jvm.functions.Function19
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19) {
        getHighResolutionOutputSizeshNQ4ISI(19);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // kotlin.jvm.functions.Function20
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20) {
        getHighResolutionOutputSizeshNQ4ISI(20);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // kotlin.jvm.functions.Function21
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21) {
        getHighResolutionOutputSizeshNQ4ISI(21);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // kotlin.jvm.functions.Function22
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21, java.lang.Object obj22) {
        getHighResolutionOutputSizeshNQ4ISI(22);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
