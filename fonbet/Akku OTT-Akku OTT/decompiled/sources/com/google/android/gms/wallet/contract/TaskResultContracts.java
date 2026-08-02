package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes4.dex */
public final class TaskResultContracts {

    public static abstract class GetApiTaskResult<T> extends ResolveApiTaskResult<T, ApiTaskResult<T>> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.ResolveApiTaskResult
        @NonNull
        public ApiTaskResult<T> outputFromTask(@NonNull Task<T> task) {
            if (task.isSuccessful()) {
                return new ApiTaskResult<>(task.getResult(), Status.e);
            }
            if (task.isCanceled()) {
                return new ApiTaskResult<>(new Status(16, "The task has been canceled.", null, null));
            }
            Status status = this.zza;
            return status != null ? new ApiTaskResult<>(status) : new ApiTaskResult<>(Status.i);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public ApiTaskResult<T> parseResult(int i, @Nullable Intent intent) {
            if (i != -1) {
                return i != 0 ? new ApiTaskResult<>(null, Status.i) : new ApiTaskResult<>(null, Status.k);
            }
            T taskResultFromIntent = intent != null ? taskResultFromIntent(intent) : null;
            return taskResultFromIntent != null ? new ApiTaskResult<>(taskResultFromIntent, Status.e) : new ApiTaskResult<>(null, Status.i);
        }

        @Nullable
        public abstract T taskResultFromIntent(@NonNull Intent intent);
    }

    public static final class GetPaymentData extends UnpackApiTaskResult<PaymentData> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public PaymentData parseResult(int i, @Nullable Intent intent) {
            if (intent != null) {
                return PaymentData.getFromIntent(intent);
            }
            return null;
        }
    }

    public static final class GetPaymentDataResult extends GetApiTaskResult<PaymentData> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult, androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public ApiTaskResult<PaymentData> parseResult(int i, @Nullable Intent intent) {
            if (i != 1) {
                return super.parseResult(i, intent);
            }
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            if (statusFromIntent == null) {
                statusFromIntent = Status.i;
            }
            return new ApiTaskResult<>(statusFromIntent);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult
        @Nullable
        public PaymentData taskResultFromIntent(@NonNull Intent intent) {
            return PaymentData.getFromIntent(intent);
        }
    }

    public static abstract class ResolveApiTaskResult<I, O> extends ActivityResultContract<Task<I>, O> {
        Status zza;
        private PendingIntent zzb;

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, @NonNull Task<I> task) {
            return new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, new IntentSenderRequest.Builder(this.zzb).build());
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public ActivityResultContract.SynchronousResult<O> getSynchronousResult(@NonNull Context context, @NonNull Task<I> task) {
            if (!task.isComplete()) {
                throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
            }
            Exception exception = task.getException();
            if (exception instanceof b) {
                this.zza = ((b) exception).getStatus();
                if (exception instanceof k) {
                    this.zzb = ((k) exception).getStatus().c;
                }
            }
            if (this.zzb == null) {
                return new ActivityResultContract.SynchronousResult<>(outputFromTask(task));
            }
            return null;
        }

        public abstract O outputFromTask(@NonNull Task<I> task);
    }

    public static abstract class UnpackApiTaskResult<T> extends ResolveApiTaskResult<T, T> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.ResolveApiTaskResult
        @Nullable
        public T outputFromTask(@NonNull Task<T> task) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            return null;
        }
    }

    private TaskResultContracts() {
    }
}
