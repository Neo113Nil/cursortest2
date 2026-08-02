package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static androidx.constraintlayout.core.Metrics sMetrics;
    final androidx.constraintlayout.core.Cache getHighSpeedVideoSizes;
    private androidx.constraintlayout.core.LinearSystem.Row getHighSpeedVideoSizesFor;
    private androidx.constraintlayout.core.LinearSystem.Row getOutputMinFrameDurationlomOqCM;
    private int getInputSizeshNQ4ISI = 1000;
    public boolean hasSimpleDefinition = false;
    int getHighSpeedVideoFpsRanges = 0;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> getOutputSizeshNQ4ISI = null;
    private int getOutputStallDuration = 32;
    private int getOutputFormats = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] getInputFormats = new boolean[32];
    int getHighSpeedVideoFpsRangesFor = 1;
    int Camera2StreamConfigurationMap = 0;
    private int getOutputMinFrameDuration = 32;
    private androidx.constraintlayout.core.SolverVariable[] getOutputSizes = new androidx.constraintlayout.core.SolverVariable[1000];
    private int getOutputStallDurationlomOqCM = 0;
    androidx.constraintlayout.core.ArrayRow[] getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.ArrayRow[32];

    interface Row {
        void addError(androidx.constraintlayout.core.SolverVariable solverVariable);

        void clear();

        androidx.constraintlayout.core.SolverVariable getKey();

        androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(androidx.constraintlayout.core.LinearSystem.Row row);

        boolean isEmpty();
    }

    static class ValuesRow extends androidx.constraintlayout.core.ArrayRow {
        ValuesRow(androidx.constraintlayout.core.Cache cache) {
            this.variables = new androidx.constraintlayout.core.SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        getHighSpeedVideoFpsRangesFor();
        androidx.constraintlayout.core.Cache cache = new androidx.constraintlayout.core.Cache();
        this.getHighSpeedVideoSizes = cache;
        this.getHighSpeedVideoSizesFor = new androidx.constraintlayout.core.PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.getOutputMinFrameDurationlomOqCM = new androidx.constraintlayout.core.LinearSystem.ValuesRow(cache);
        } else {
            this.getOutputMinFrameDurationlomOqCM = new androidx.constraintlayout.core.ArrayRow(cache);
        }
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics metrics) {
        sMetrics = metrics;
    }

    public static androidx.constraintlayout.core.Metrics getMetrics() {
        return sMetrics;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.getOutputStallDuration * 2;
        this.getOutputStallDuration = i;
        this.getHighResolutionOutputSizeshNQ4ISI = (androidx.constraintlayout.core.ArrayRow[]) java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, i);
        androidx.constraintlayout.core.Cache cache = this.getHighSpeedVideoSizes;
        cache.getHighSpeedVideoFpsRanges = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(cache.getHighSpeedVideoFpsRanges, this.getOutputStallDuration);
        int i2 = this.getOutputStallDuration;
        this.getInputFormats = new boolean[i2];
        this.getOutputFormats = i2;
        this.getOutputMinFrameDuration = i2;
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            metrics2.maxTableSize = java.lang.Math.max(metrics2.maxTableSize, this.getOutputStallDuration);
            androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
            metrics3.lastTableSize = metrics3.maxTableSize;
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        int i = 0;
        if (OPTIMIZED_ENGINE) {
            while (i < this.Camera2StreamConfigurationMap) {
                androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i];
                if (arrayRow != null) {
                    this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(arrayRow);
                }
                this.getHighResolutionOutputSizeshNQ4ISI[i] = null;
                i++;
            }
            return;
        }
        while (i < this.Camera2StreamConfigurationMap) {
            androidx.constraintlayout.core.ArrayRow arrayRow2 = this.getHighResolutionOutputSizeshNQ4ISI[i];
            if (arrayRow2 != null) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(arrayRow2);
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i] = null;
            i++;
        }
    }

    public void reset() {
        for (int i = 0; i < this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.length; i++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[i];
            if (solverVariable != null) {
                solverVariable.reset();
            }
        }
        this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this.getOutputSizes, this.getOutputStallDurationlomOqCM);
        this.getOutputStallDurationlomOqCM = 0;
        java.util.Arrays.fill(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges, (java.lang.Object) null);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> hashMap = this.getOutputSizeshNQ4ISI;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizesFor.clear();
        this.getHighSpeedVideoFpsRangesFor = 1;
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap; i2++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i2];
            if (arrayRow != null) {
                arrayRow.getHighSpeedVideoFpsRanges = false;
            }
        }
        getHighSpeedVideoFpsRangesFor();
        this.Camera2StreamConfigurationMap = 0;
        if (OPTIMIZED_ENGINE) {
            this.getOutputMinFrameDurationlomOqCM = new androidx.constraintlayout.core.LinearSystem.ValuesRow(this.getHighSpeedVideoSizes);
        } else {
            this.getOutputMinFrameDurationlomOqCM = new androidx.constraintlayout.core.ArrayRow(this.getHighSpeedVideoSizes);
        }
    }

    public androidx.constraintlayout.core.SolverVariable createObjectVariable(java.lang.Object obj) {
        androidx.constraintlayout.core.SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.getHighSpeedVideoFpsRangesFor + 1 >= this.getOutputFormats) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        if (obj instanceof androidx.constraintlayout.core.widgets.ConstraintAnchor) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = (androidx.constraintlayout.core.widgets.ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.getHighSpeedVideoSizes);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            if (solverVariable.id != -1 && solverVariable.id <= this.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[solverVariable.id] != null) {
                return solverVariable;
            }
            if (solverVariable.id != -1) {
                solverVariable.reset();
            }
            int i = this.getHighSpeedVideoFpsRanges + 1;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor++;
            solverVariable.id = i;
            solverVariable.getOutputFormats = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED;
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRanges] = solverVariable;
        }
        return solverVariable;
    }

    public androidx.constraintlayout.core.ArrayRow createRow() {
        androidx.constraintlayout.core.ArrayRow highResolutionOutputSizeshNQ4ISI;
        if (OPTIMIZED_ENGINE) {
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == null) {
                highResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.LinearSystem.ValuesRow(this.getHighSpeedVideoSizes);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                highResolutionOutputSizeshNQ4ISI.reset();
            }
        } else {
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == null) {
                highResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.ArrayRow(this.getHighSpeedVideoSizes);
                ARRAY_ROW_CREATION++;
            } else {
                highResolutionOutputSizeshNQ4ISI.reset();
            }
        }
        androidx.constraintlayout.core.SolverVariable.getHighSpeedVideoSizes();
        return highResolutionOutputSizeshNQ4ISI;
    }

    public androidx.constraintlayout.core.SolverVariable createSlackVariable() {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.getHighSpeedVideoFpsRangesFor + 1 >= this.getOutputFormats) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.constraintlayout.core.SolverVariable highSpeedVideoSizes = getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable.Type.SLACK, null);
        int i = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor++;
        highSpeedVideoSizes.id = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRanges] = highSpeedVideoSizes;
        return highSpeedVideoSizes;
    }

    public androidx.constraintlayout.core.SolverVariable createExtraVariable() {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.getHighSpeedVideoFpsRangesFor + 1 >= this.getOutputFormats) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.constraintlayout.core.SolverVariable highSpeedVideoSizes = getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable.Type.SLACK, null);
        int i = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor++;
        highSpeedVideoSizes.id = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRanges] = highSpeedVideoSizes;
        return highSpeedVideoSizes;
    }

    private void getHighSpeedVideoSizes(androidx.constraintlayout.core.ArrayRow arrayRow, int i, int i2) {
        arrayRow.Camera2StreamConfigurationMap(createErrorVariable(i2, null), i);
    }

    public androidx.constraintlayout.core.SolverVariable createErrorVariable(int i, java.lang.String str) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.getHighSpeedVideoFpsRangesFor + 1 >= this.getOutputFormats) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.constraintlayout.core.SolverVariable highSpeedVideoSizes = getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable.Type.ERROR, str);
        int i2 = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor++;
        highSpeedVideoSizes.id = i2;
        highSpeedVideoSizes.strength = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRanges] = highSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor.addError(highSpeedVideoSizes);
        return highSpeedVideoSizes;
    }

    private androidx.constraintlayout.core.SolverVariable getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable.Type type, java.lang.String str) {
        androidx.constraintlayout.core.SolverVariable highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null) {
            highResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.SolverVariable(type, str);
            highResolutionOutputSizeshNQ4ISI.setType(type, str);
        } else {
            highResolutionOutputSizeshNQ4ISI.reset();
            highResolutionOutputSizeshNQ4ISI.setType(type, str);
        }
        int i = this.getOutputStallDurationlomOqCM;
        int i2 = this.getInputSizeshNQ4ISI;
        if (i >= i2) {
            int i3 = i2 * 2;
            this.getInputSizeshNQ4ISI = i3;
            this.getOutputSizes = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(this.getOutputSizes, i3);
        }
        androidx.constraintlayout.core.SolverVariable[] solverVariableArr = this.getOutputSizes;
        int i4 = this.getOutputStallDurationlomOqCM;
        this.getOutputStallDurationlomOqCM = i4 + 1;
        solverVariableArr[i4] = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public int getObjectVariableValue(java.lang.Object obj) {
        androidx.constraintlayout.core.SolverVariable solverVariable = ((androidx.constraintlayout.core.widgets.ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public void minimize() throws java.lang.Exception {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.getHighSpeedVideoSizesFor.isEmpty()) {
            getHighSpeedVideoSizes();
            return;
        }
        if (this.graphOptimizer || this.newgraphOptimizer) {
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI[i].getHighSpeedVideoFpsRangesFor) {
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor);
                    return;
                }
            }
            androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
            if (metrics3 != null) {
                metrics3.fullySolved++;
            }
            getHighSpeedVideoSizes();
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.LinearSystem.Row row) throws java.lang.Exception {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            metrics2.maxVariables = java.lang.Math.max(metrics2.maxVariables, this.getHighSpeedVideoFpsRangesFor);
            androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
            metrics3.maxRows = java.lang.Math.max(metrics3.maxRows, this.Camera2StreamConfigurationMap);
        }
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap(row);
        getHighSpeedVideoSizes();
    }

    public void addConstraint(androidx.constraintlayout.core.ArrayRow arrayRow) {
        androidx.constraintlayout.core.SolverVariable pickPivot;
        if (arrayRow != null) {
            androidx.constraintlayout.core.Metrics metrics = sMetrics;
            if (metrics != null) {
                metrics.constraints++;
                if (arrayRow.getHighSpeedVideoFpsRangesFor) {
                    sMetrics.simpleconstraints++;
                }
            }
            boolean z = true;
            if (this.Camera2StreamConfigurationMap + 1 >= this.getOutputMinFrameDuration || this.getHighSpeedVideoFpsRangesFor + 1 >= this.getOutputFormats) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            if (!arrayRow.getHighSpeedVideoFpsRangesFor) {
                arrayRow.updateFromSystem(this);
                if (arrayRow.isEmpty()) {
                    return;
                }
                arrayRow.getHighResolutionOutputSizeshNQ4ISI();
                if (arrayRow.getHighSpeedVideoFpsRangesFor(this)) {
                    androidx.constraintlayout.core.SolverVariable createExtraVariable = createExtraVariable();
                    arrayRow.getHighResolutionOutputSizeshNQ4ISI = createExtraVariable;
                    int i = this.Camera2StreamConfigurationMap;
                    getHighResolutionOutputSizeshNQ4ISI(arrayRow);
                    if (this.Camera2StreamConfigurationMap == i + 1) {
                        this.getOutputMinFrameDurationlomOqCM.initFromRow(arrayRow);
                        Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM);
                        if (createExtraVariable.getHighSpeedVideoSizes == -1) {
                            if (arrayRow.getHighResolutionOutputSizeshNQ4ISI == createExtraVariable && (pickPivot = arrayRow.pickPivot(createExtraVariable)) != null) {
                                androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
                                if (metrics2 != null) {
                                    metrics2.pivots++;
                                }
                                arrayRow.getHighResolutionOutputSizeshNQ4ISI(pickPivot);
                            }
                            if (!arrayRow.getHighSpeedVideoFpsRangesFor) {
                                arrayRow.getHighResolutionOutputSizeshNQ4ISI.updateReferencesWithNewDefinition(this, arrayRow);
                            }
                            if (OPTIMIZED_ENGINE) {
                                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(arrayRow);
                            } else {
                                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(arrayRow);
                            }
                            this.Camera2StreamConfigurationMap--;
                        }
                        if (arrayRow.getHighSpeedVideoFpsRanges() || z) {
                            return;
                        }
                    }
                }
                z = false;
                if (arrayRow.getHighSpeedVideoFpsRanges()) {
                    return;
                } else {
                    return;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI(arrayRow);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i;
        if (SIMPLIFY_SYNONYMS && arrayRow.getHighSpeedVideoFpsRangesFor) {
            arrayRow.getHighResolutionOutputSizeshNQ4ISI.setFinalValue(this, arrayRow.getHighSpeedVideoSizes);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI[this.Camera2StreamConfigurationMap] = arrayRow;
            arrayRow.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap++;
            arrayRow.getHighResolutionOutputSizeshNQ4ISI.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i2 = 0;
            while (i2 < this.Camera2StreamConfigurationMap) {
                if (this.getHighResolutionOutputSizeshNQ4ISI[i2] == null) {
                    java.lang.System.out.println("WTF");
                }
                androidx.constraintlayout.core.ArrayRow arrayRow2 = this.getHighResolutionOutputSizeshNQ4ISI[i2];
                if (arrayRow2 != null && arrayRow2.getHighSpeedVideoFpsRangesFor) {
                    androidx.constraintlayout.core.ArrayRow arrayRow3 = this.getHighResolutionOutputSizeshNQ4ISI[i2];
                    arrayRow3.getHighResolutionOutputSizeshNQ4ISI.setFinalValue(this, arrayRow3.getHighSpeedVideoSizes);
                    if (OPTIMIZED_ENGINE) {
                        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(arrayRow3);
                    } else {
                        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(arrayRow3);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI[i2] = null;
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (true) {
                        i = this.Camera2StreamConfigurationMap;
                        if (i3 >= i) {
                            break;
                        }
                        androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = i3 - 1;
                        androidx.constraintlayout.core.ArrayRow arrayRow4 = arrayRowArr[i3];
                        arrayRowArr[i5] = arrayRow4;
                        if (arrayRow4.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes == i3) {
                            this.getHighResolutionOutputSizeshNQ4ISI[i5].getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = i5;
                        }
                        i4 = i3;
                        i3++;
                    }
                    if (i4 < i) {
                        this.getHighResolutionOutputSizeshNQ4ISI[i4] = null;
                    }
                    this.Camera2StreamConfigurationMap = i - 1;
                    i2--;
                }
                i2++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    public void removeRow(androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i;
        if (!arrayRow.getHighSpeedVideoFpsRangesFor || arrayRow.getHighResolutionOutputSizeshNQ4ISI == null) {
            return;
        }
        if (arrayRow.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes != -1) {
            int i2 = arrayRow.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            while (true) {
                i = this.Camera2StreamConfigurationMap - 1;
                if (i2 >= i) {
                    break;
                }
                int i3 = i2 + 1;
                androidx.constraintlayout.core.SolverVariable solverVariable = this.getHighResolutionOutputSizeshNQ4ISI[i3].getHighResolutionOutputSizeshNQ4ISI;
                if (solverVariable.getHighSpeedVideoSizes == i3) {
                    solverVariable.getHighSpeedVideoSizes = i2;
                }
                androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.getHighResolutionOutputSizeshNQ4ISI;
                arrayRowArr[i2] = arrayRowArr[i3];
                i2 = i3;
            }
            this.Camera2StreamConfigurationMap = i;
        }
        if (!arrayRow.getHighResolutionOutputSizeshNQ4ISI.isFinalValue) {
            arrayRow.getHighResolutionOutputSizeshNQ4ISI.setFinalValue(this, arrayRow.getHighSpeedVideoSizes);
        }
        if (OPTIMIZED_ENGINE) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(arrayRow);
        } else {
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(arrayRow);
        }
    }

    private int Camera2StreamConfigurationMap(androidx.constraintlayout.core.LinearSystem.Row row) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor; i++) {
            this.getInputFormats[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i2++;
            if (i2 >= this.getHighSpeedVideoFpsRangesFor * 2) {
                break;
            }
            if (row.getKey() != null) {
                this.getInputFormats[row.getKey().id] = true;
            }
            androidx.constraintlayout.core.SolverVariable pivotCandidate = row.getPivotCandidate(this, this.getInputFormats);
            if (pivotCandidate != null) {
                if (this.getInputFormats[pivotCandidate.id]) {
                    break;
                }
                this.getInputFormats[pivotCandidate.id] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.Camera2StreamConfigurationMap; i4++) {
                    androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i4];
                    if (arrayRow.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats != androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED && !arrayRow.getHighSpeedVideoFpsRangesFor && arrayRow.getHighSpeedVideoFpsRanges(pivotCandidate)) {
                        float f2 = arrayRow.variables.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-arrayRow.getHighSpeedVideoSizes) / f2;
                            if (f3 < f) {
                                i3 = i4;
                                f = f3;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    androidx.constraintlayout.core.ArrayRow arrayRow2 = this.getHighResolutionOutputSizeshNQ4ISI[i3];
                    arrayRow2.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = -1;
                    androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.getHighResolutionOutputSizeshNQ4ISI(pivotCandidate);
                    arrayRow2.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = i3;
                    arrayRow2.getHighResolutionOutputSizeshNQ4ISI.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    private int getHighSpeedVideoFpsRanges() throws java.lang.Exception {
        for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI[i].getHighResolutionOutputSizeshNQ4ISI.getOutputFormats != androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED && this.getHighResolutionOutputSizeshNQ4ISI[i].getHighSpeedVideoSizes < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    androidx.constraintlayout.core.Metrics metrics = sMetrics;
                    if (metrics != null) {
                        metrics.bfs++;
                    }
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = 0;
                    for (int i6 = 0; i6 < this.Camera2StreamConfigurationMap; i6++) {
                        androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i6];
                        if (arrayRow.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats != androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED && !arrayRow.getHighSpeedVideoFpsRangesFor && arrayRow.getHighSpeedVideoSizes < 0.0f) {
                            int i7 = 9;
                            if (SKIP_COLUMNS) {
                                int currentSize = arrayRow.variables.getCurrentSize();
                                int i8 = 0;
                                while (i8 < currentSize) {
                                    androidx.constraintlayout.core.SolverVariable variable = arrayRow.variables.getVariable(i8);
                                    float f2 = arrayRow.variables.get(variable);
                                    if (f2 > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f3 = variable.getInputSizeshNQ4ISI[i9] / f2;
                                            if ((f3 < f && i9 == i5) || i9 > i5) {
                                                i4 = variable.id;
                                                i5 = i9;
                                                i3 = i6;
                                                f = f3;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.getHighSpeedVideoFpsRangesFor; i10++) {
                                    androidx.constraintlayout.core.SolverVariable solverVariable = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[i10];
                                    float f4 = arrayRow.variables.get(solverVariable);
                                    if (f4 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f5 = solverVariable.getInputSizeshNQ4ISI[i11] / f4;
                                            if ((f5 < f && i11 == i5) || i11 > i5) {
                                                i5 = i11;
                                                i3 = i6;
                                                i4 = i10;
                                                f = f5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i3 != -1) {
                        androidx.constraintlayout.core.ArrayRow arrayRow2 = this.getHighResolutionOutputSizeshNQ4ISI[i3];
                        arrayRow2.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = -1;
                        androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
                        if (metrics2 != null) {
                            metrics2.pivots++;
                        }
                        arrayRow2.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[i4]);
                        arrayRow2.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = i3;
                        arrayRow2.getHighResolutionOutputSizeshNQ4ISI.updateReferencesWithNewDefinition(this, arrayRow2);
                    } else {
                        z = true;
                    }
                    if (i2 > this.getHighSpeedVideoFpsRangesFor / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    private void getHighSpeedVideoSizes() {
        for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i];
            arrayRow.getHighResolutionOutputSizeshNQ4ISI.computedValue = arrayRow.getHighSpeedVideoSizes;
        }
    }

    public void displayReadableRows() {
        Camera2StreamConfigurationMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" num vars ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj = sb.toString();
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges + 1; i++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[i];
            if (solverVariable != null && solverVariable.isFinalValue) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(" $[");
                sb2.append(i);
                sb2.append("] => ");
                sb2.append(solverVariable);
                sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb2.append(solverVariable.computedValue);
                sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                obj = sb2.toString();
            }
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj2 = sb3.toString();
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges + 1; i2++) {
            androidx.constraintlayout.core.SolverVariable solverVariable2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[i2];
            if (solverVariable2 != null && solverVariable2.getOutputMinFrameDuration) {
                androidx.constraintlayout.core.SolverVariable solverVariable3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[solverVariable2.getHighSpeedVideoSizesFor];
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(obj2);
                sb4.append(" ~[");
                sb4.append(i2);
                sb4.append("] => ");
                sb4.append(solverVariable2);
                sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb4.append(solverVariable3);
                sb4.append(" + ");
                sb4.append(solverVariable2.getInputFormats);
                sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                obj2 = sb4.toString();
            }
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(obj2);
        sb5.append("\n\n #  ");
        java.lang.String obj3 = sb5.toString();
        for (int i3 = 0; i3 < this.Camera2StreamConfigurationMap; i3++) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(obj3);
            sb6.append(this.getHighResolutionOutputSizeshNQ4ISI[i3].getHighSpeedVideoFpsRangesFor());
            java.lang.String obj4 = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(obj4);
            sb7.append("\n #  ");
            obj3 = sb7.toString();
        }
        if (this.getHighSpeedVideoSizesFor != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(obj3);
            sb8.append("Goal: ");
            sb8.append(this.getHighSpeedVideoSizesFor);
            sb8.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            obj3 = sb8.toString();
        }
        java.lang.System.out.println(obj3);
    }

    public void displayVariablesReadableRows() {
        Camera2StreamConfigurationMap();
        java.lang.String str = "";
        for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI[i].getHighResolutionOutputSizeshNQ4ISI.getOutputFormats == androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI[i].getHighSpeedVideoFpsRangesFor());
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                str = sb2.toString();
            }
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(this.getHighSpeedVideoSizesFor);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.System.out.println(sb3.toString());
    }

    public int getMemoryUsed() {
        int i = 0;
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap; i2++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i2];
            if (arrayRow != null) {
                i += (arrayRow.getHighResolutionOutputSizeshNQ4ISI != null ? 4 : 0) + 8 + arrayRow.variables.sizeInBytes();
            }
        }
        return i;
    }

    public int getNumEquations() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getNumVariables() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private void Camera2StreamConfigurationMap() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Display Rows (");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("x");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(")\n");
        java.lang.System.out.println(sb.toString());
    }

    public androidx.constraintlayout.core.Cache getCache() {
        return this.getHighSpeedVideoSizes;
    }

    public void addGreaterThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        androidx.constraintlayout.core.SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (i2 != 8) {
            getHighSpeedVideoSizes(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(createRow);
    }

    public void addGreaterBarrier(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        androidx.constraintlayout.core.SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public void addLowerThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        androidx.constraintlayout.core.SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (i2 != 8) {
            getHighSpeedVideoSizes(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(createRow);
    }

    public void addLowerBarrier(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        androidx.constraintlayout.core.SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public void addCentering(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, float f, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        if (solverVariable2 == solverVariable3) {
            createRow.variables.put(solverVariable, 1.0f);
            createRow.variables.put(solverVariable4, 1.0f);
            createRow.variables.put(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            createRow.variables.put(solverVariable, 1.0f);
            createRow.variables.put(solverVariable2, -1.0f);
            createRow.variables.put(solverVariable3, -1.0f);
            createRow.variables.put(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                createRow.getHighSpeedVideoSizes = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            createRow.variables.put(solverVariable, -1.0f);
            createRow.variables.put(solverVariable2, 1.0f);
            createRow.getHighSpeedVideoSizes = i;
        } else if (f >= 1.0f) {
            createRow.variables.put(solverVariable4, -1.0f);
            createRow.variables.put(solverVariable3, 1.0f);
            createRow.getHighSpeedVideoSizes = -i2;
        } else {
            float f2 = 1.0f - f;
            createRow.variables.put(solverVariable, f2 * 1.0f);
            createRow.variables.put(solverVariable2, f2 * (-1.0f));
            createRow.variables.put(solverVariable3, (-1.0f) * f);
            createRow.variables.put(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                createRow.getHighSpeedVideoSizes = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            createRow.addError(this, i3);
        }
        addConstraint(createRow);
    }

    public void addRatio(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            createRow.addError(this, i);
        }
        addConstraint(createRow);
    }

    public void addSynonym(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i) {
        if (solverVariable.getHighSpeedVideoSizes == -1 && i == 0) {
            if (solverVariable2.getOutputMinFrameDuration) {
                float f = solverVariable2.getInputFormats;
                solverVariable2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[solverVariable2.getHighSpeedVideoSizesFor];
            }
            if (solverVariable.getOutputMinFrameDuration) {
                float f2 = solverVariable.getInputFormats;
                androidx.constraintlayout.core.SolverVariable solverVariable3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[solverVariable.getHighSpeedVideoSizesFor];
                return;
            } else {
                solverVariable.setSynonym(this, solverVariable2, 0.0f);
                return;
            }
        }
        addEquality(solverVariable, solverVariable2, i, 8);
    }

    public androidx.constraintlayout.core.ArrayRow addEquality(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && i2 == 8 && solverVariable2.isFinalValue && solverVariable.getHighSpeedVideoSizes == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i);
            return null;
        }
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            createRow.addError(this, i2);
        }
        addConstraint(createRow);
        return createRow;
    }

    public void addEquality(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && solverVariable.getHighSpeedVideoSizes == -1) {
            float f = i;
            solverVariable.setFinalValue(this, f);
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges + 1; i2++) {
                androidx.constraintlayout.core.SolverVariable solverVariable2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[i2];
                if (solverVariable2 != null && solverVariable2.getOutputMinFrameDuration && solverVariable2.getHighSpeedVideoSizesFor == solverVariable.id) {
                    solverVariable2.setFinalValue(this, solverVariable2.getInputFormats + f);
                }
            }
            return;
        }
        int i3 = solverVariable.getHighSpeedVideoSizes;
        if (solverVariable.getHighSpeedVideoSizes != -1) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.getHighResolutionOutputSizeshNQ4ISI[i3];
            if (arrayRow.getHighSpeedVideoFpsRangesFor) {
                arrayRow.getHighSpeedVideoSizes = i;
                return;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.getHighSpeedVideoFpsRangesFor = true;
                arrayRow.getHighSpeedVideoSizes = i;
                return;
            } else {
                androidx.constraintlayout.core.ArrayRow createRow = createRow();
                createRow.createRowEquals(solverVariable, i);
                addConstraint(createRow);
                return;
            }
        }
        androidx.constraintlayout.core.ArrayRow createRow2 = createRow();
        createRow2.getHighResolutionOutputSizeshNQ4ISI = solverVariable;
        float f2 = i;
        solverVariable.computedValue = f2;
        createRow2.getHighSpeedVideoSizes = f2;
        createRow2.getHighSpeedVideoFpsRangesFor = true;
        addConstraint(createRow2);
    }

    public static androidx.constraintlayout.core.ArrayRow createRowDimensionPercent(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, float f) {
        androidx.constraintlayout.core.ArrayRow createRow = linearSystem.createRow();
        createRow.variables.put(solverVariable, -1.0f);
        createRow.variables.put(solverVariable2, f);
        return createRow;
    }

    public void addCenterPoint(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2, float f, int i) {
        androidx.constraintlayout.core.SolverVariable createObjectVariable = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
        androidx.constraintlayout.core.SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
        androidx.constraintlayout.core.SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
        androidx.constraintlayout.core.SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
        androidx.constraintlayout.core.SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
        androidx.constraintlayout.core.SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
        androidx.constraintlayout.core.SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
        androidx.constraintlayout.core.SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
        androidx.constraintlayout.core.ArrayRow createRow = createRow();
        double d = f;
        double d2 = i;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (java.lang.Math.sin(d) * d2));
        addConstraint(createRow);
        androidx.constraintlayout.core.ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, createObjectVariable7, (float) (java.lang.Math.cos(d) * d2));
        addConstraint(createRow2);
    }
}
