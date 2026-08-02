package org.betup.ui.fragment.bets;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import org.betup.ui.fragment.bets.BaseBettingController;

/* loaded from: classes4.dex */
public class BetSliderController implements SeekBar.OnSeekBarChangeListener {
    private final EditText amountField;
    private final BaseBettingController.FragmentCallback fragmentCallback;
    private long maxAmount;
    private long minAmount;
    private final ReturnDisplay returnDisplay;
    private final SeekBar slider;
    private int sliderStep;
    private double totalOdds;

    public interface ReturnDisplay {
        void setReturnValue(long value);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public BetSliderController(BaseBettingController.FragmentCallback fragmentCallback, ReturnDisplay returnDisplay, EditText amountField, SeekBar slider) {
        this.fragmentCallback = fragmentCallback;
        this.returnDisplay = returnDisplay;
        this.amountField = amountField;
        this.slider = slider;
        init();
    }

    public void updateStats(long minAmount, long maxAmount, double totalOdds) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.totalOdds = totalOdds;
        int calculateSliderStep = calculateSliderStep();
        this.sliderStep = calculateSliderStep;
        this.slider.setMax((int) ((maxAmount - minAmount) / calculateSliderStep));
    }

    public void setCurrentAmount(long amount) {
        applyAmountToSlider(amount);
        this.amountField.setText(String.valueOf(amount));
    }

    public void clear() {
        this.slider.setProgress(0);
        this.amountField.setText("0");
    }

    private int calculateSliderStep() {
        return (int) Math.pow(10.0d, String.valueOf((int) ((this.maxAmount - this.minAmount) / 50)).length() - 1);
    }

    private void init() {
        this.slider.setOnSeekBarChangeListener(this);
        this.slider.requestFocus();
        this.amountField.addTextChangedListener(new TextWatcher() { // from class: org.betup.ui.fragment.bets.BetSliderController.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                long j;
                if (BetSliderController.this.fragmentCallback.isActive()) {
                    try {
                        j = Math.round(Float.valueOf(BetSliderController.this.amountField.getText().toString()).floatValue());
                    } catch (Exception unused) {
                        j = BetSliderController.this.minAmount;
                    }
                    BetSliderController.this.returnDisplay.setReturnValue(Math.round(j * BetSliderController.this.totalOdds));
                    BetSliderController.this.applyAmountToSlider(j);
                }
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (fromUser) {
            if (progress == 0) {
                this.amountField.setText(String.valueOf(this.minAmount));
                return;
            }
            if (progress == this.slider.getMax()) {
                this.amountField.setText(String.valueOf(this.maxAmount));
                return;
            }
            long j = this.sliderStep;
            long j2 = this.minAmount;
            this.amountField.setText(String.valueOf(j <= j2 ? j2 + (progress * r5) : progress * r5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyAmountToSlider(long amount) {
        if (amount < this.maxAmount) {
            this.slider.setProgress((int) ((amount - this.minAmount) / this.sliderStep));
        } else {
            SeekBar seekBar = this.slider;
            seekBar.setProgress(seekBar.getMax());
        }
    }
}
