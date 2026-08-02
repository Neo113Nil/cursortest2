package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class FunctionDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl implements kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor {
    private kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility ArtificialStackFrames;
    private boolean Camera2StreamConfigurationMap;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> CoroutineDebuggingKt;
    private kotlin.reflect.jvm.internal.impl.types.KotlinType accessartificialFrame;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> coroutineBoundary;
    private java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> coroutineCreation;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private volatile kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor>> getValidOutputFormatsForInputhNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.descriptors.Modality isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor toString;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind unwrapAs;
    protected java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> userDataMap;

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected FunctionDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name2, sourceElement);
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (kind == null) {
            Camera2StreamConfigurationMap(3);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(4);
        }
        this.ArtificialStackFrames = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.UNKNOWN;
        this.getOutputStallDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = false;
        this.getInputSizeshNQ4ISI = false;
        this.getOutputStallDuration = false;
        this.isOutputSupportedForhNQ4ISI = false;
        this.getOutputFormats = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputSizes = false;
        this.getOutputMinFrameDuration = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoFpsRanges = true;
        this.Camera2StreamConfigurationMap = false;
        this.coroutineCreation = null;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.getInputFormats = null;
        this.userDataMap = null;
        this.toString = functionDescriptor == null ? this : functionDescriptor;
        this.unwrapAs = kind;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl initialize(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            Camera2StreamConfigurationMap(5);
        }
        if (list2 == null) {
            Camera2StreamConfigurationMap(6);
        }
        if (list3 == null) {
            Camera2StreamConfigurationMap(7);
        }
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(8);
        }
        this.CoroutineDebuggingKt = kotlin.collections.CollectionsKt.toList(list2);
        this.coroutineBoundary = kotlin.collections.CollectionsKt.toList(list3);
        this.accessartificialFrame = kotlinType;
        this.isOutputSupportedFor = modality;
        this.ArtificialStackFrames = descriptorVisibility;
        this.getHighSpeedVideoSizes = receiverParameterDescriptor;
        this.getHighSpeedVideoFpsRangesFor = receiverParameterDescriptor2;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        for (int i = 0; i < list2.size(); i++) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = list2.get(i);
            if (typeParameterDescriptor.getIndex() != i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(typeParameterDescriptor);
                sb.append(" index is ");
                sb.append(typeParameterDescriptor.getIndex());
                sb.append(" but position is ");
                sb.append(i);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = list3.get(i2);
            if (valueParameterDescriptor.getIndex() != i2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(valueParameterDescriptor);
                sb2.append("index is ");
                sb2.append(valueParameterDescriptor.getIndex());
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        }
        return this;
    }

    public void setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(10);
        }
        this.ArtificialStackFrames = descriptorVisibility;
    }

    public void setOperator(boolean z) {
        this.getOutputStallDurationlomOqCM = z;
    }

    public void setInfix(boolean z) {
        this.getOutputSizeshNQ4ISI = z;
    }

    public void setExternal(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public void setInline(boolean z) {
        this.getOutputStallDuration = z;
    }

    public void setTailrec(boolean z) {
        this.isOutputSupportedForhNQ4ISI = z;
    }

    public void setExpect(boolean z) {
        this.getOutputFormats = z;
    }

    public void setActual(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    public void setSuspend(boolean z) {
        this.getOutputMinFrameDurationlomOqCM = z;
    }

    public void setReturnType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            Camera2StreamConfigurationMap(11);
        }
        this.accessartificialFrame = kotlinType;
    }

    public void setHasStableParameterNames(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceiverParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list == null) {
            Camera2StreamConfigurationMap(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.isOutputSupportedFor;
        if (modality == null) {
            Camera2StreamConfigurationMap(15);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = this.ArtificialStackFrames;
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(16);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if (this.getOutputStallDurationlomOqCM) {
            return true;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if (this.getOutputSizeshNQ4ISI) {
            return true;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isExternal() {
        return this.getInputSizeshNQ4ISI;
    }

    public boolean isInline() {
        return this.getOutputStallDuration;
    }

    public boolean isTailrec() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey) {
        java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.getOutputSizes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOverriddenDescriptors(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (collection == 0) {
            Camera2StreamConfigurationMap(17);
        }
        this.coroutineCreation = collection;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.getOutputMinFrameDuration = true;
                return;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.CoroutineDebuggingKt;
        if (list == null) {
            throw new java.lang.IllegalStateException("typeParameters == null for ".concat(java.lang.String.valueOf(this)));
        }
        if (list == null) {
            Camera2StreamConfigurationMap(18);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = this.coroutineBoundary;
        if (list == null) {
            Camera2StreamConfigurationMap(19);
        }
        return list;
    }

    public boolean hasStableParameterNames() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        return this.accessartificialFrame;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = this.toString;
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = functionDescriptor == this ? this : functionDescriptor.getOriginal();
        if (original == null) {
            Camera2StreamConfigurationMap(20);
        }
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = this.unwrapAs;
        if (kind == null) {
            Camera2StreamConfigurationMap(21);
        }
        return kind;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Camera2StreamConfigurationMap(22);
        }
        return typeSubstitutor.isEmpty() ? this : newCopyBuilder(typeSubstitutor).setOriginal((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) getOriginal()).setPreserveSourceElement().setJustForTypeSubstitution(true).build();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.getOutputMinFrameDuration;
    }

    public class CopyConfiguration implements kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> {
        private java.lang.Boolean Camera2StreamConfigurationMap;
        protected boolean copyOverrides;
        protected kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter;
        protected boolean dropOriginalInContainingParts;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes;
        private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getInputFormats;
        private java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> getInputSizeshNQ4ISI;
        protected boolean justForTypeSubstitution;
        protected kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind;

        /* renamed from: name, reason: collision with root package name */
        protected kotlin.reflect.jvm.internal.impl.name.Name f6917name;
        protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> newContextReceiverParameters;
        protected kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor newExtensionReceiverParameter;
        protected kotlin.reflect.jvm.internal.impl.descriptors.Modality newModality;
        protected kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor newOwner;
        protected kotlin.reflect.jvm.internal.impl.types.KotlinType newReturnType;
        protected java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> newValueParameterDescriptors;
        protected kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility newVisibility;
        protected kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original;
        protected boolean preserveSourceElement;
        protected boolean signatureChange;
        protected kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution;

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setTypeParameters(java.util.List list) {
            return setTypeParameters2((java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>) list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setValueParameters(java.util.List list) {
            return setValueParameters2((java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor>) list);
        }

        public CopyConfiguration(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl functionDescriptorImpl, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list2, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            if (typeSubstitution == null) {
                getHighSpeedVideoSizes(0);
            }
            if (declarationDescriptor == null) {
                getHighSpeedVideoSizes(1);
            }
            if (modality == null) {
                getHighSpeedVideoSizes(2);
            }
            if (descriptorVisibility == null) {
                getHighSpeedVideoSizes(3);
            }
            if (kind == null) {
                getHighSpeedVideoSizes(4);
            }
            if (list == null) {
                getHighSpeedVideoSizes(5);
            }
            if (list2 == null) {
                getHighSpeedVideoSizes(6);
            }
            if (kotlinType == null) {
                getHighSpeedVideoSizes(7);
            }
            this.getHighSpeedVideoFpsRanges = functionDescriptorImpl;
            this.original = null;
            this.dispatchReceiverParameter = functionDescriptorImpl.getHighSpeedVideoFpsRangesFor;
            this.copyOverrides = true;
            this.signatureChange = false;
            this.preserveSourceElement = false;
            this.dropOriginalInContainingParts = false;
            this.getHighSpeedVideoFpsRangesFor = functionDescriptorImpl.isHiddenToOvercomeSignatureClash();
            this.getInputFormats = null;
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI = functionDescriptorImpl.isHiddenForResolutionEverywhereBesideSupercalls();
            this.getInputSizeshNQ4ISI = new java.util.LinkedHashMap();
            this.Camera2StreamConfigurationMap = null;
            this.justForTypeSubstitution = false;
            this.substitution = typeSubstitution;
            this.newOwner = declarationDescriptor;
            this.newModality = modality;
            this.newVisibility = descriptorVisibility;
            this.kind = kind;
            this.newValueParameterDescriptors = list;
            this.newContextReceiverParameters = list2;
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            this.newReturnType = kotlinType;
            this.f6917name = name2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setOwner(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                getHighSpeedVideoSizes(8);
            }
            this.newOwner = declarationDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality) {
            if (modality == null) {
                getHighSpeedVideoSizes(10);
            }
            this.newModality = modality;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                getHighSpeedVideoSizes(12);
            }
            this.newVisibility = descriptorVisibility;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setKind(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                getHighSpeedVideoSizes(14);
            }
            this.kind = kind;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setName(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            if (name2 == null) {
                getHighSpeedVideoSizes(17);
            }
            this.f6917name = name2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: setValueParameters, reason: avoid collision after fix types in other method */
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setValueParameters2(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list) {
            if (list == null) {
                getHighSpeedVideoSizes(19);
            }
            this.newValueParameterDescriptors = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: setTypeParameters, reason: avoid collision after fix types in other method */
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setTypeParameters2(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
            if (list == null) {
                getHighSpeedVideoSizes(21);
            }
            this.getInputFormats = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setReturnType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            if (kotlinType == null) {
                getHighSpeedVideoSizes(23);
            }
            this.newReturnType = kotlinType;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setExtensionReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setDispatchReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.dispatchReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setOriginal(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setSignatureChange() {
            this.signatureChange = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setPreserveSourceElement() {
            this.preserveSourceElement = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setDropOriginalInContainingParts() {
            this.dropOriginalInContainingParts = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setHiddenToOvercomeSignatureClash() {
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setHiddenForResolutionEverywhereBesideSupercalls() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setAdditionalAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
            if (annotations == null) {
                getHighSpeedVideoSizes(35);
            }
            this.getHighSpeedVideoSizes = annotations;
            return this;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration setHasSynthesizedParameterNames(boolean z) {
            this.Camera2StreamConfigurationMap = java.lang.Boolean.valueOf(z);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> setSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                getHighSpeedVideoSizes(37);
            }
            this.substitution = typeSubstitution;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public <V> kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> putUserData(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey, V v) {
            if (userDataKey == null) {
                getHighSpeedVideoSizes(39);
            }
            this.getInputSizeshNQ4ISI.put(userDataKey, v);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor build() {
            return this.getHighSpeedVideoFpsRanges.doSubstitute(this);
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration setJustForTypeSubstitution(boolean z) {
            this.justForTypeSubstitution = z;
            return this;
        }

        private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            java.lang.Object[] objArr = new java.lang.Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner;
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new java.lang.IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new java.lang.IllegalArgumentException(format);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> newCopyBuilder() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration newCopyBuilder = newCopyBuilder(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.EMPTY);
        if (newCopyBuilder == null) {
            Camera2StreamConfigurationMap(23);
        }
        return newCopyBuilder;
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration newCopyBuilder(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Camera2StreamConfigurationMap(24);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration(this, typeSubstitutor.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getContextReceiverParameters(), getExtensionReceiverParameter(), getReturnType(), null);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor doSubstitute(kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor;
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute;
        if (copyConfiguration == null) {
            Camera2StreamConfigurationMap(25);
        }
        boolean[] zArr = new boolean[1];
        if (copyConfiguration.getHighSpeedVideoSizes != null) {
            annotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(getAnnotations(), copyConfiguration.getHighSpeedVideoSizes);
        } else {
            annotations = getAnnotations();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2 = annotations;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = copyConfiguration.newOwner;
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = copyConfiguration.original;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = copyConfiguration.kind;
        kotlin.reflect.jvm.internal.impl.name.Name name2 = copyConfiguration.f6917name;
        boolean z = copyConfiguration.preserveSourceElement;
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor2 = copyConfiguration.original;
        if (z) {
            if (functionDescriptor2 == null) {
                functionDescriptor2 = getOriginal();
            }
            sourceElement = functionDescriptor2.getSource();
        } else {
            sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement2 = sourceElement;
        if (sourceElement2 == null) {
            Camera2StreamConfigurationMap(27);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl createSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, functionDescriptor, kind, name2, annotations2, sourceElement2);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = copyConfiguration.getInputFormats == null ? getTypeParameters() : copyConfiguration.getInputFormats;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.size());
        final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor substituteTypeParameters = kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.substitution, createSubstitutedCopy, arrayList, zArr);
        if (substituteTypeParameters == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!copyConfiguration.newContextReceiverParameters.isEmpty()) {
            int i = 0;
            for (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor2 : copyConfiguration.newContextReceiverParameters) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType substitute2 = substituteTypeParameters.substitute(receiverParameterDescriptor2.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
                if (substitute2 == null) {
                    return null;
                }
                arrayList2.add(kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createContextReceiverParameterForCallable(createSubstitutedCopy, substitute2, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver) receiverParameterDescriptor2.getValue()).getCustomLabelName(), receiverParameterDescriptor2.getAnnotations(), i));
                zArr[0] = (substitute2 != receiverParameterDescriptor2.getType()) | zArr[0];
                i++;
            }
        }
        if (copyConfiguration.newExtensionReceiverParameter != null) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType substitute3 = substituteTypeParameters.substitute(copyConfiguration.newExtensionReceiverParameter.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
            if (substitute3 == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl(createSubstitutedCopy, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver(createSubstitutedCopy, substitute3, copyConfiguration.newExtensionReceiverParameter.getValue()), copyConfiguration.newExtensionReceiverParameter.getAnnotations());
            zArr[0] = (substitute3 != copyConfiguration.newExtensionReceiverParameter.getType()) | zArr[0];
            receiverParameterDescriptorImpl = receiverParameterDescriptorImpl2;
        } else {
            receiverParameterDescriptorImpl = null;
        }
        if (copyConfiguration.dispatchReceiverParameter != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor substitute4 = copyConfiguration.dispatchReceiverParameter.substitute(substituteTypeParameters);
            if (substitute4 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (substitute4 != copyConfiguration.dispatchReceiverParameter);
            receiverParameterDescriptor = substitute4;
        } else {
            receiverParameterDescriptor = null;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> substitutedValueParameters = getSubstitutedValueParameters(createSubstitutedCopy, copyConfiguration.newValueParameterDescriptors, substituteTypeParameters, copyConfiguration.dropOriginalInContainingParts, copyConfiguration.preserveSourceElement, zArr);
        if (substitutedValueParameters == null || (substitute = substituteTypeParameters.substitute(copyConfiguration.newReturnType, kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z2 = zArr[0] | (substitute != copyConfiguration.newReturnType);
        zArr[0] = z2;
        if (!z2 && copyConfiguration.justForTypeSubstitution) {
            return this;
        }
        createSubstitutedCopy.initialize(receiverParameterDescriptorImpl, receiverParameterDescriptor, arrayList2, arrayList, substitutedValueParameters, substitute, copyConfiguration.newModality, copyConfiguration.newVisibility);
        createSubstitutedCopy.setOperator(this.getOutputStallDurationlomOqCM);
        createSubstitutedCopy.setInfix(this.getOutputSizeshNQ4ISI);
        createSubstitutedCopy.setExternal(this.getInputSizeshNQ4ISI);
        createSubstitutedCopy.setInline(this.getOutputStallDuration);
        createSubstitutedCopy.setTailrec(this.isOutputSupportedForhNQ4ISI);
        createSubstitutedCopy.setSuspend(this.getOutputMinFrameDurationlomOqCM);
        createSubstitutedCopy.setExpect(this.getOutputFormats);
        createSubstitutedCopy.setActual(this.getHighSpeedVideoSizesFor);
        createSubstitutedCopy.setHasStableParameterNames(this.getHighSpeedVideoFpsRanges);
        createSubstitutedCopy.getOutputSizes = copyConfiguration.getHighSpeedVideoFpsRangesFor;
        createSubstitutedCopy.getOutputMinFrameDuration = copyConfiguration.getHighResolutionOutputSizeshNQ4ISI;
        createSubstitutedCopy.setHasSynthesizedParameterNames(copyConfiguration.Camera2StreamConfigurationMap != null ? copyConfiguration.Camera2StreamConfigurationMap.booleanValue() : this.Camera2StreamConfigurationMap);
        if (!copyConfiguration.getInputSizeshNQ4ISI.isEmpty() || this.userDataMap != null) {
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> map = copyConfiguration.getInputSizeshNQ4ISI;
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> map2 = this.userDataMap;
            if (map2 != null) {
                for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                createSubstitutedCopy.userDataMap = java.util.Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                createSubstitutedCopy.userDataMap = map;
            }
        }
        if (copyConfiguration.signatureChange || getInitialSignatureDescriptor() != null) {
            createSubstitutedCopy.getInputFormats = (getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(substituteTypeParameters);
        }
        if (copyConfiguration.copyOverrides && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (copyConfiguration.substitution.isEmpty()) {
                kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor>> function0 = this.getValidOutputFormatsForInputhNQ4ISI;
                if (function0 != null) {
                    createSubstitutedCopy.getValidOutputFormatsForInputhNQ4ISI = function0;
                    return createSubstitutedCopy;
                }
                createSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                return createSubstitutedCopy;
            }
            createSubstitutedCopy.getValidOutputFormatsForInputhNQ4ISI = new kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.1
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> invoke() {
                    kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
                    java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> it = kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.this.getOverriddenDescriptors().iterator();
                    while (it.hasNext()) {
                        smartList.add(it.next().substitute(substituteTypeParameters));
                    }
                    return smartList;
                }
            };
        }
        return createSubstitutedCopy;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        if (build == null) {
            Camera2StreamConfigurationMap(26);
        }
        return build;
    }

    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitFunctionDescriptor(this, d);
    }

    public static java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getSubstitutedValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            Camera2StreamConfigurationMap(28);
        }
        if (typeSubstitutor == null) {
            Camera2StreamConfigurationMap(29);
        }
        return getSubstitutedValueParameters(functionDescriptor, list, typeSubstitutor, false, false, null);
    }

    public static java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getSubstitutedValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        kotlin.jvm.functions.Function0<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> function0;
        if (list == null) {
            Camera2StreamConfigurationMap(30);
        }
        if (typeSubstitutor == null) {
            Camera2StreamConfigurationMap(31);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : list) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType substitute = typeSubstitutor.substitute(valueParameterDescriptor.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
            kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
            kotlin.reflect.jvm.internal.impl.types.KotlinType substitute2 = varargElementType == null ? null : typeSubstitutor.substitute(varargElementType, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE);
            if (substitute == null) {
                return null;
            }
            if ((substitute != valueParameterDescriptor.getType() || varargElementType != substitute2) && zArr != null) {
                zArr[0] = true;
            }
            if (valueParameterDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration) {
                final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor> destructuringVariables = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).getDestructuringVariables();
                function0 = new kotlin.jvm.functions.Function0<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.2
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor> invoke() {
                        return destructuringVariables;
                    }
                };
            } else {
                function0 = null;
            }
            arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.createWithDestructuringDeclarations(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), substitute, valueParameterDescriptor.declaresDefaultValue(), valueParameterDescriptor.isCrossinline(), valueParameterDescriptor.isNoinline(), substitute2, z2 ? valueParameterDescriptor.getSource() : kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, function0));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getInitialSignatureDescriptor() {
        return this.getInputFormats;
    }

    public <V> void putInUserDataMap(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<V> userDataKey, java.lang.Object obj) {
        if (this.userDataMap == null) {
            this.userDataMap = new java.util.LinkedHashMap();
        }
        this.userDataMap.put(userDataKey, obj);
    }

    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getOverriddenDescriptors() {
        kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor>> function0 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (function0 != null) {
            this.coroutineCreation = function0.invoke();
            this.getValidOutputFormatsForInputhNQ4ISI = null;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = this.coroutineCreation;
        if (collection == null) {
            collection = java.util.Collections.emptyList();
        }
        if (collection == null) {
            Camera2StreamConfigurationMap(14);
        }
        return collection;
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new java.lang.IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
