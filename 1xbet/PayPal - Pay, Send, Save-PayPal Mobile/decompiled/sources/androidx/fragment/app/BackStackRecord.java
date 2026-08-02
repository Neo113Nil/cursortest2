package androidx.fragment.app;

/* loaded from: classes3.dex */
final class BackStackRecord extends androidx.fragment.app.FragmentTransaction implements androidx.fragment.app.FragmentManager.BackStackEntry, androidx.fragment.app.FragmentManager.OpGenerator {
    final androidx.fragment.app.FragmentManager getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.getHighSpeedVideoFpsRanges >= 0) {
            sb.append(" #");
            sb.append(this.getHighSpeedVideoFpsRanges);
        }
        if (this.getOutputSizes != null) {
            sb.append(" ");
            sb.append(this.getOutputSizes);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void getHighSpeedVideoFpsRanges(java.lang.String str, java.io.PrintWriter printWriter, boolean z) {
        java.lang.String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.getOutputSizes);
            printWriter.print(" mIndex=");
            printWriter.print(this.getHighSpeedVideoFpsRanges);
            printWriter.print(" mCommitted=");
            printWriter.println(this.getHighSpeedVideoFpsRangesFor);
            if (this.ArtificialStackFrames != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.ArtificialStackFrames));
            }
            if (this.getOutputStallDurationlomOqCM != 0 || this.getOutputStallDuration != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.getOutputStallDurationlomOqCM));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.getOutputStallDuration));
            }
            if (this.getValidOutputFormatsForInputhNQ4ISI != 0 || this.toString != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.getValidOutputFormatsForInputhNQ4ISI));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.toString));
            }
            if (this.getOutputMinFrameDuration != 0 || this.getInputSizeshNQ4ISI != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.getOutputMinFrameDuration));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.getInputSizeshNQ4ISI);
            }
            if (this.getHighSpeedVideoSizesFor != 0 || this.getOutputFormats != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.getHighSpeedVideoSizesFor));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.getOutputFormats);
            }
        }
        if (this.getOutputSizeshNQ4ISI.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.getOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.getOutputSizeshNQ4ISI.get(i);
            switch (op.Camera2StreamConfigurationMap) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.HIDE;
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("cmd=");
                    sb.append(op.Camera2StreamConfigurationMap);
                    str2 = sb.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(op.getHighSpeedVideoFpsRanges);
            if (z) {
                if (op.getHighSpeedVideoFpsRangesFor != 0 || op.getHighSpeedVideoSizes != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(op.getHighSpeedVideoFpsRangesFor));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(op.getHighSpeedVideoSizes));
                }
                if (op.getOutputMinFrameDuration != 0 || op.getInputFormats != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(op.getOutputMinFrameDuration));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(op.getInputFormats));
                }
            }
        }
    }

    BackStackRecord(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().getContext().getClassLoader() : null);
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoSizes = false;
        this.getHighResolutionOutputSizeshNQ4ISI = fragmentManager;
    }

    BackStackRecord(androidx.fragment.app.BackStackRecord backStackRecord) {
        super(backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getFragmentFactory(), backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHost() != null ? backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHost().getContext().getClassLoader() : null, backStackRecord);
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoSizes = false;
        this.getHighResolutionOutputSizeshNQ4ISI = backStackRecord.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = backStackRecord.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = backStackRecord.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = backStackRecord.getHighSpeedVideoSizes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getBreadCrumbTitleRes() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final int getBreadCrumbShortTitleRes() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final java.lang.CharSequence getBreadCrumbTitle() {
        if (this.getOutputMinFrameDuration != 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHost().getContext().getText(this.getOutputMinFrameDuration);
        }
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final java.lang.CharSequence getBreadCrumbShortTitle() {
        if (this.getHighSpeedVideoSizesFor != 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHost().getContext().getText(this.getHighSpeedVideoSizesFor);
        }
        return this.getOutputFormats;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    final void getHighSpeedVideoFpsRanges(int i, androidx.fragment.app.Fragment fragment, java.lang.String str, int i2) {
        super.getHighSpeedVideoFpsRanges(i, fragment, str, i2);
        fragment.mFragmentManager = this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return super.hide(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return super.show(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment fragment) {
        if (fragment != null && fragment.mFragmentManager != null && fragment.mFragmentManager != this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
        if (fragment.mFragmentManager != this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (state == androidx.lifecycle.Lifecycle.State.INITIALIZED && fragment.mState >= 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot set maximum Lifecycle to ");
            sb2.append(state);
            sb2.append(" after the Fragment has been created");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (state == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Cannot set maximum Lifecycle to ");
            sb3.append(state);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        return super.setMaxLifecycle(fragment, state);
    }

    final void getHighSpeedVideoSizes(int i) {
        if (this.Camera2StreamConfigurationMap) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            int size = this.getOutputSizeshNQ4ISI.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.FragmentTransaction.Op op = this.getOutputSizeshNQ4ISI.get(i2);
                if (op.getHighSpeedVideoFpsRanges != null) {
                    op.getHighSpeedVideoFpsRanges.mBackStackNesting += i;
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        androidx.fragment.app.Fragment fragment = op.getHighSpeedVideoFpsRanges;
                        int i3 = op.getHighSpeedVideoFpsRanges.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void getHighSpeedVideoSizes() {
        if (this.getOutputMinFrameDurationlomOqCM != null) {
            for (int i = 0; i < this.getOutputMinFrameDurationlomOqCM.size(); i++) {
                this.getOutputMinFrameDurationlomOqCM.get(i).run();
            }
            this.getOutputMinFrameDurationlomOqCM = null;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commit() {
        return getHighSpeedVideoSizes(false, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commitAllowingStateLoss() {
        return getHighSpeedVideoSizes(true, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNow() {
        disallowAddToBackStack();
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI((androidx.fragment.app.FragmentManager.OpGenerator) this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI((androidx.fragment.app.FragmentManager.OpGenerator) this, true);
    }

    final int getHighSpeedVideoSizes(boolean z, boolean z2) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.LogWriter(androidx.fragment.app.FragmentManager.TAG));
            getHighSpeedVideoFpsRanges("  ", printWriter, true);
            printWriter.close();
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getAndIncrement();
        } else {
            this.getHighSpeedVideoFpsRanges = -1;
        }
        if (z2) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this, z);
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public final boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.Camera2StreamConfigurationMap) {
            return true;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges.add(this);
        return true;
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        int size = this.getOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.FragmentTransaction.Op op = this.getOutputSizeshNQ4ISI.get(i);
            androidx.fragment.app.Fragment fragment = op.getHighSpeedVideoFpsRanges;
            if (fragment != null) {
                fragment.mBeingSaved = this.getHighSpeedVideoSizes;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.ArtificialStackFrames);
                fragment.setSharedElementNames(this.unwrapAs, this.isOutputSupportedForhNQ4ISI);
            }
            switch (op.Camera2StreamConfigurationMap) {
                case 1:
                    fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, false);
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment);
                    break;
                case 2:
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown cmd: ");
                    sb.append(op.Camera2StreamConfigurationMap);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                case 3:
                    fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, false);
                    androidx.fragment.app.FragmentManager.isOutputSupportedForhNQ4ISI(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, false);
                    this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(fragment);
                    break;
                case 8:
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes(fragment);
                    break;
                case 9:
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes(null);
                    break;
                case 10:
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, op.getHighResolutionOutputSizeshNQ4ISI);
                    break;
            }
        }
    }

    final androidx.fragment.app.Fragment getHighResolutionOutputSizeshNQ4ISI(java.util.ArrayList<androidx.fragment.app.Fragment> arrayList, androidx.fragment.app.Fragment fragment) {
        byte b = 0;
        androidx.fragment.app.Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.getOutputSizeshNQ4ISI.size()) {
            androidx.fragment.app.FragmentTransaction.Op op = this.getOutputSizeshNQ4ISI.get(i);
            int i2 = op.Camera2StreamConfigurationMap;
            if (i2 != 1) {
                if (i2 == 2) {
                    androidx.fragment.app.Fragment fragment3 = op.getHighSpeedVideoFpsRanges;
                    int i3 = fragment3.mContainerId;
                    int size = arrayList.size() - 1;
                    byte b2 = b;
                    while (size >= 0) {
                        androidx.fragment.app.Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                b2 = 1;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.getOutputSizeshNQ4ISI.add(i, new androidx.fragment.app.FragmentTransaction.Op(9, fragment4, b));
                                    i++;
                                    fragment2 = null;
                                }
                                androidx.fragment.app.FragmentTransaction.Op op2 = new androidx.fragment.app.FragmentTransaction.Op(3, fragment4, b);
                                op2.getHighSpeedVideoFpsRangesFor = op.getHighSpeedVideoFpsRangesFor;
                                op2.getOutputMinFrameDuration = op.getOutputMinFrameDuration;
                                op2.getHighSpeedVideoSizes = op.getHighSpeedVideoSizes;
                                op2.getInputFormats = op.getInputFormats;
                                this.getOutputSizeshNQ4ISI.add(i, op2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                        size--;
                        b = 0;
                    }
                    if (b2 != 0) {
                        this.getOutputSizeshNQ4ISI.remove(i);
                        i--;
                    } else {
                        op.Camera2StreamConfigurationMap = 1;
                        op.getHighSpeedVideoSizesFor = true;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(op.getHighSpeedVideoFpsRanges);
                    if (op.getHighSpeedVideoFpsRanges == fragment2) {
                        this.getOutputSizeshNQ4ISI.add(i, new androidx.fragment.app.FragmentTransaction.Op(9, op.getHighSpeedVideoFpsRanges));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.getOutputSizeshNQ4ISI.add(i, new androidx.fragment.app.FragmentTransaction.Op(9, fragment2, b));
                        op.getHighSpeedVideoSizesFor = true;
                        i++;
                        fragment2 = op.getHighSpeedVideoFpsRanges;
                    }
                }
                i++;
                b = 0;
            }
            arrayList.add(op.getHighSpeedVideoFpsRanges);
            i++;
            b = 0;
        }
        return fragment2;
    }

    final void getHighSpeedVideoFpsRanges() {
        int size = this.getOutputSizeshNQ4ISI.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            androidx.fragment.app.FragmentTransaction.Op op = this.getOutputSizeshNQ4ISI.get(size);
            if (op.getHighSpeedVideoSizesFor) {
                if (op.Camera2StreamConfigurationMap == 8) {
                    op.getHighSpeedVideoSizesFor = false;
                    size--;
                    this.getOutputSizeshNQ4ISI.remove(size);
                } else {
                    int i = op.getHighSpeedVideoFpsRanges.mContainerId;
                    op.Camera2StreamConfigurationMap = 2;
                    op.getHighSpeedVideoSizesFor = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        androidx.fragment.app.FragmentTransaction.Op op2 = this.getOutputSizeshNQ4ISI.get(i2);
                        if (op2.getHighSpeedVideoSizesFor && op2.getHighSpeedVideoFpsRanges.mContainerId == i) {
                            this.getOutputSizeshNQ4ISI.remove(i2);
                            size--;
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public final java.lang.String getName() {
        return this.getOutputSizes;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final boolean isEmpty() {
        return this.getOutputSizeshNQ4ISI.isEmpty();
    }
}
