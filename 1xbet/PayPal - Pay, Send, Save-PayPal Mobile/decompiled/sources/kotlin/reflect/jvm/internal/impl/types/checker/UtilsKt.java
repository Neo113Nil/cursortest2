package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class UtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.add(new kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode(kotlinType, null));
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType2.getConstructor();
        while (!arrayDeque.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode subtypePathNode = (kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode) arrayDeque.poll();
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType3 = subtypePathNode.getHighSpeedVideoFpsRangesFor;
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor2 = kotlinType3.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean isMarkedNullable = kotlinType3.isMarkedNullable();
                for (kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode subtypePathNode2 = subtypePathNode.getHighResolutionOutputSizeshNQ4ISI; subtypePathNode2 != null; subtypePathNode2 = subtypePathNode2.getHighResolutionOutputSizeshNQ4ISI) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType4 = subtypePathNode2.getHighSpeedVideoFpsRangesFor;
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType4.getArguments();
                    if (!(arguments instanceof java.util.Collection) || !arguments.isEmpty()) {
                        java.util.Iterator<T> it = arguments.iterator();
                        while (it.hasNext()) {
                            if (((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                                kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(kotlinType4), false, 1, null).buildSubstitutor().safeSubstitute(kotlinType3, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(safeSubstitute, "");
                                kotlinType3 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypes(safeSubstitute).getUpper();
                                break;
                            }
                        }
                    }
                    kotlinType3 = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(kotlinType4).buildSubstitutor().safeSubstitute(kotlinType3, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType3);
                    isMarkedNullable = isMarkedNullable || kotlinType4.isMarkedNullable();
                }
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor3 = kotlinType3.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(kotlinType3, isMarkedNullable);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Type constructors should be equals!\nsubstitutedSuperType: ");
                sb.append(getHighSpeedVideoFpsRangesFor(constructor3));
                sb.append(", \n\nsupertype: ");
                sb.append(getHighSpeedVideoFpsRangesFor(constructor));
                sb.append(" \n");
                sb.append(typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
                throw new java.lang.AssertionError(sb.toString());
            }
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType5 : constructor2.getSupertypes()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType5);
                arrayDeque.add(new kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode(kotlinType5, subtypePathNode));
            }
        }
        return null;
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String concat = "type: ".concat(java.lang.String.valueOf(typeConstructor));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concat, "");
        sb.append(concat);
        sb.append('\n');
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("hashCode: ");
        sb2.append(typeConstructor.hashCode());
        java.lang.String obj = sb2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        sb.append(obj);
        sb.append('\n');
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("javaClass: ");
        sb3.append(typeConstructor.getClass().getCanonicalName());
        java.lang.String obj2 = sb3.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        sb.append(obj2);
        sb.append('\n');
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor(); mo23898getDeclarationDescriptor != null; mo23898getDeclarationDescriptor = mo23898getDeclarationDescriptor.getContainingDeclaration()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("fqName: ");
            sb4.append(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.FQ_NAMES_IN_TYPES.render(mo23898getDeclarationDescriptor));
            java.lang.String obj3 = sb4.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "");
            sb.append(obj3);
            sb.append('\n');
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("javaClass: ");
            sb5.append(mo23898getDeclarationDescriptor.getClass().getCanonicalName());
            java.lang.String obj4 = sb5.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "");
            sb.append(obj4);
            sb.append('\n');
        }
        return sb.toString();
    }
}
